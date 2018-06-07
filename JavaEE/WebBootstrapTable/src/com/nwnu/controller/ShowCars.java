package com.nwnu.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.nwnu.bean.Car;
import com.nwnu.utils.ResponseUtl;

@WebServlet("/ShowCars")
public class ShowCars extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String op = request.getParameter("op");
		ArrayList<Car> cars = (ArrayList<Car>) request.getSession()
				.getAttribute("cars");
		if (cars == null) {
			cars = new ArrayList<Car>();
		}
		switch (op) {
		case "show":

			JSONObject jsonObject = new JSONObject();
			jsonObject.put("total", cars.size());

			jsonObject.put("rows", cars);
			// jsonObject2.put("cars", cars.get(0));
			// System.out.println(jsonObject);
			// System.out.println(jsonObject2);

			ResponseUtl.write(response, jsonObject.toJSONString());
			return;
		case "add1":

			String number = request.getParameter("number");
			String name = request.getParameter("name");
			String date = request.getParameter("date");
			Car car = new Car(number, name, date);
			cars.add(car);
			request.getSession().setAttribute("cars", cars);
			response.sendRedirect("InputAndShow.jsp");
			return;
		case "add2":

			String number1 = request.getParameter("number");
			String name1 = request.getParameter("name");
			String date1 = request.getParameter("date");
			Car car1 = new Car(number1, name1, date1);
			cars.add(car1);
			request.getSession().setAttribute("cars", cars);
			response.sendRedirect("input.jsp");
			return;

		default:
			break;
		}
		response.sendRedirect("InputAndShow.jsp");
	}
}
