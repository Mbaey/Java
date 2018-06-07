package com.withyou.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.withyou.bean.Mgr;
import com.withyou.bean.User;
import com.withyou.dao.MgrDao;
import com.withyou.dao.UserDao;

public class MgrDaoImpl implements MgrDao{

	@Override
	public boolean insertMgr(Mgr mgr) throws SQLException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		  
        Session s = sf.openSession();
        s.beginTransaction();
        //增
        s.save(mgr);
//        //查        
//        Product p2 =(Product) s.get(Product.class, 1);        
//        System.out.println("id=1的产品名称是: "+p2.getName());
//         
//        //删
//        Product p3 =(Product) s.get(Product.class, 1);
//        s.delete(p3);
        
//        //改
//        Product p =(Product) s.get(Product.class, 6);
//        
//        System.out.println(p.getName());
//         
//        p.setName("iphone-modified");
//         
//        s.update(p);
        s.getTransaction().commit();
        s.close();
        sf.close();
	return false;
	}

	@Override
	public boolean deleteMgr(Mgr mgr) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMgrById(Mgr mgr, int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
