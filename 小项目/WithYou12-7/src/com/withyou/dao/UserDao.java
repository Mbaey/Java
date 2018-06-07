package com.withyou.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.withyou.bean.User;

public interface UserDao {
	public boolean insertUser(User use) throws SQLException;
	public boolean deleteUser(User use) throws SQLException;
	public boolean updateUserById(User use, int id) throws SQLException;
	public ArrayList<User> selectAllUsers_OrderByCredit() throws SQLException;
	/**
	 * 管理员根据用户名查找用户
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<User> selectUsers_ByName_OrderById(String name) throws SQLException;
}
