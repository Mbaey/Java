package com.withyou.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.withyou.bean.User;
import com.withyou.dao.UserDao;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean insertUser(User use) throws SQLException {
		  SessionFactory sf = new Configuration().configure().buildSessionFactory();
		  
	        Session s = sf.openSession();
	        s.beginTransaction();
	        //增
	        s.save(use);

	        s.getTransaction().commit();
	        s.close();
	        sf.close();
		return false;
	}

	@Override
	public boolean deleteUser(User use) throws SQLException {
		 SessionFactory sf = new Configuration().configure().buildSessionFactory();
		 Session s = sf.openSession();
	        s.beginTransaction();
	       
	        //删
	        User p3 =(User) s.get(User.class, 1);
	        s.delete(p3);
	        
	        s.getTransaction().commit();
	        s.close();
	        sf.close();
		return false;
	}

	@Override
	public boolean updateUserById(User use, int id) throws SQLException {
		 SessionFactory sf = new Configuration().configure().buildSessionFactory();
		  
	        Session s = sf.openSession();
	        s.beginTransaction();
	          
	        //改
	        User p =(User) s.get(User.class, 6);
	        
	        System.out.println(p);
	         
	        p.setU_name("iphone-modified");
	        
	        s.update(p);
	        
	        s.getTransaction().commit();
	        s.close();
	        sf.close();
		return false;
	}

	@Override
	public ArrayList<User> selectAllUsers_OrderByCredit() throws SQLException {
		 SessionFactory sf = new Configuration().configure().buildSessionFactory();
		  
	        Session s = sf.openSession();
	        s.beginTransaction();
	        
	        //查        
	        User p2 =(User) s.get(User.class, 1);        
	        System.out.println("id=1的产品名称是: "+p2);

	        s.getTransaction().commit();
	        s.close();
	        sf.close();
		return null;
	}

	@Override
	public ArrayList<User> selectUsers_ByName_OrderById(String name) throws SQLException {
		 SessionFactory sf = new Configuration().configure().buildSessionFactory();
		  
	        Session s = sf.openSession();
	        s.beginTransaction();
	        
	        String sql = "select * from user p where p.name like '%"+name+"%'";
	         
	        Query q= s.createSQLQuery(sql);
	        List<Object[]> list= q.list();
	        for (Object[] os : list) {
	            for (Object filed: os) {
	                System.out.print(filed+"\t");
	            }
	            System.out.println();
	        }
	        
	        
	        s.getTransaction().commit();
	        s.close();
	        sf.close();
		return null;
	}

}
