package com.nwnu.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.nwnu.bean.Mess;
import com.nwnu.utils.ResponseUtl;

/**
 * Servlet implementation class ShowMess
 */
@WebServlet("/ShowMess")
public class ShowMess extends HttpServlet {
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		ServletContext application = this.getServletContext();// 获取application
		
		ArrayList<Mess> board = (ArrayList<Mess>) application
				.getAttribute("cars");
		if (board == null) {
			board = new ArrayList<Mess>();
		}
		switch (op) {
		case "show":

			JSONObject jsonObject = new JSONObject();
			jsonObject.put("total", board.size());

			jsonObject.put("rows", board);
			// jsonObject2.put("cars", cars.get(0));
			// System.out.println(jsonObject);
			// System.out.println(jsonObject2);

			ResponseUtl.write(response, jsonObject.toJSONString());
			return;

		case "add":
			String name = request.getParameter("name");
			String title = request.getParameter("title");
			String message = request.getParameter("message");
			
			String timestampDate = simpleDateFormat.format(new Date());
			Mess mess = new Mess(name, title, message, timestampDate);
			board.add(mess);
			application.setAttribute("cars", board);
			response.sendRedirect("inputMess.jsp");
			return;

		default:
			break;
		}
		response.sendRedirect("showMess.jsp");
	}

}
