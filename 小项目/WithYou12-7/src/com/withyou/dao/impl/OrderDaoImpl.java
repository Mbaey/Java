package com.withyou.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.withyou.bean.Order;
import com.withyou.bean.User;
import com.withyou.dao.OrderDao;
import com.withyou.dao.UserDao;

public class OrderDaoImpl implements OrderDao{

	@Override
	public boolean insertOrder(Order order) throws SQLException {
		  SessionFactory sf = new Configuration().configure().buildSessionFactory();
		  
	        Session s = sf.openSession();
	        s.beginTransaction();
	        //增
	        s.save(order);
//	        //查        
//	        Product p2 =(Product) s.get(Product.class, 1);        
//	        System.out.println("id=1的产品名称是: "+p2.getName());
//	         
//	        //删
//	        Product p3 =(Product) s.get(Product.class, 1);
//	        s.delete(p3);
	        
//	        //改
//	        Product p =(Product) s.get(Product.class, 6);
//	        
//	        System.out.println(p.getName());
//	         
//	        p.setName("iphone-modified");
//	         
//	        s.update(p);
	        s.getTransaction().commit();
	        s.close();
	        sf.close();
		return false;
	}

	@Override
	public boolean deleteOrder(Order order) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrderById(Order order, int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Order> selectAllOrders_OrderByS_Time() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Order> selectOrders_ByName_OrderByPrice(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
