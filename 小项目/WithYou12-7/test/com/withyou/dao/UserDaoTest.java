package com.withyou.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.withyou.bean.User;
import com.withyou.dao.impl.UserDaoImpl;

public class UserDaoTest {
	public static UserDaoImpl udi = new UserDaoImpl();
	@Test
	public void testInsertUser() throws SQLException {
		User use = new User("Li", "123456", "ltgy", "182");
		System.out.println(use);
		boolean insertUser = udi.insertUser(use);
		
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUserById() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectAllUsers_OrderByCredit() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectUsers_ByName_OrderById() {
		fail("Not yet implemented");
	}

}
