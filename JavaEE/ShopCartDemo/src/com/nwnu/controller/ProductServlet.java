package com.nwnu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.nwnu.bean.Product;
import com.nwnu.dao.ProductDAO;
import com.nwnu.utils.ResponseUtl;

import jdk.nashorn.internal.parser.JSONParser;

/**
 * Servlet implementation class goodsServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	ProductDAO productDAO =  new ProductDAO();
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String op = request.getParameter("op");
    	switch (op) {
		case "list1":			
			list1(request, response);
			break;
		case "list2":
			int cp = Integer.parseInt(request.getParameter("cp"));
			int ps = Integer.parseInt(request.getParameter("ps"));
			List<Product> products =productDAO.ListProduct(cp/ps, ps);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("total", productDAO.countAll());
			jsonObject.put("rows", products);
			ResponseUtl.write(response, jsonObject.toJSONString());
			break;
		default:
			break;
		}
 
    }

	private void list1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> products = new ProductDAO().ListProduct();
		request.setAttribute("products", products);
		request.getRequestDispatcher("listProduct.jsp").forward(request, response);
	}

}
