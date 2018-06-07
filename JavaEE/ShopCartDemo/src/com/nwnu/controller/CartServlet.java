package com.nwnu.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.nwnu.bean.Cart;
import com.nwnu.bean.CartItem;
import com.nwnu.bean.Product;
import com.nwnu.dao.ProductDAO;
import com.nwnu.utils.CartCacheUtil;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {

	private int uid;
	private Cart mycart;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("op");
		Object userId = request.getSession().getAttribute("userId");
		if (userId == null) {
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			return;
		}

		uid = (int) userId;
		List<CartItem> cis = (List<CartItem>) request.getSession().getAttribute("cis");
		if (null == cis) {
			cis = new ArrayList<CartItem>();
			String realPath = getServletContext().getRealPath("/WEB-INF/json/");
			mycart = CartCacheUtil.getInstance(uid, realPath);
			// 更具数据 同步购物车
			if (mycart.getUid() != 0) {
				Set<Entry<String, Integer>> entrySet = mycart.getProducts().entrySet();
				for (Entry<String, Integer> item : entrySet) {
					int id = Integer.parseInt(item.getKey());
					Product product = new ProductDAO().getProduct(id);
					int num = item.getValue();
					CartItem ci = new CartItem(id, product, num);
					cis.add(ci);
				}
			}
		}

		switch (op) {
		case "add":
			add(request, response, cis);
			break;
		case "save":
			save(response, cis);
			break;
		case "show":
			request.getSession().setAttribute("cis", cis);
			response.sendRedirect(request.getContextPath() + "/cart.jsp");
		default:
			break;
		}
	}

	private void save(HttpServletResponse response, List<CartItem> cis) throws IOException {
		Cart cart = new Cart();
		cart.setUid(uid);
		HashMap<String, Integer> products = new HashMap<String, Integer>();
		float sum = 0;
		for (CartItem orderItem : cis) {
			products.put(orderItem.getId() + "", orderItem.getNum());
			sum += orderItem.getProduct().getPrice() * orderItem.getNum();
		}
		cart.setProducts(products);
		cart.setSum(sum);
		String jsonString = JSON.toJSONString(cart);
		System.out.println(jsonString);
		try {
//			https://www.cnblogs.com/franson-2016/p/5728280.html
			String realPath = getServletContext().getRealPath("/WEB-INF/json/");
			System.out.println(realPath);
			String pathname = realPath+""+cart.getUid() + ".json";
			File file = new File(pathname);
			file.createNewFile();
			if (file == null) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);

			fw.write(jsonString);

			fw.flush();
			fw.close();
			System.out.println(uid + "存储成功: " + file.getAbsolutePath() + file.getPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().println("订单创建成功");
	}

	private void add(HttpServletRequest request, HttpServletResponse response, List<CartItem> cis) throws IOException {
		int pid = Integer.parseInt(request.getParameter("pid"));
		int num = Integer.parseInt(request.getParameter("num"));
		Product p = new ProductDAO().getProduct(pid);

		CartItem ci = new CartItem(pid, p, num);

		boolean found = false;
		for (CartItem orderItem : cis) {
			if (orderItem.getProduct().getId() == ci.getProduct().getId()) {
				orderItem.setNum(orderItem.getNum() + ci.getNum());
				found = true;
				break;
			}
		}

		if (!found)
			cis.add(ci);

		request.getSession().setAttribute("cis", cis);
		response.sendRedirect(request.getContextPath() + "/cart.jsp");
	}
}
