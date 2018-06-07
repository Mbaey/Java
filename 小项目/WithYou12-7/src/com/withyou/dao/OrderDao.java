package com.withyou.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.withyou.bean.Order;

public interface OrderDao {
	public boolean insertOrder(Order order) throws SQLException;
	public boolean deleteOrder(Order order) throws SQLException;
	public boolean updateOrderById(Order order, int id) throws SQLException;
	public ArrayList<Order> selectAllOrders_OrderByS_Time() throws SQLException;
	/**
	 * 兼职者 根据任务名字查找任务
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Order> selectOrders_ByName_OrderByPrice(String name) throws SQLException;
}
