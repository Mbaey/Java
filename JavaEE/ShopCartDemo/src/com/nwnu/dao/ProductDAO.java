package com.nwnu.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.junit.Test;

import com.nwnu.bean.Product;
import com.nwnu.utils.DBUtil;

public class ProductDAO {

	public static void main(String[] args) {

		// System.out.println(new ProductDAO().ListProduct().size());
		try {
			Connection c = DBUtil.getConnection();
			String sql = "insert into product (name, price) values(?, ?)";
			PreparedStatement ps = c.prepareStatement(sql);
			Scanner sc = new Scanner(new File("produce.txt"));
			while (sc.hasNext()) {
				String name = sc.next();
				ps.setString(1, name);
				ps.setFloat(2, new Random().nextFloat() * 1000);
				ps.executeUpdate();
			}
		} catch (SQLException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Product getProduct(int id) {
		Product result = null;

		try {
			Connection c = DBUtil.getConnection();

			String sql = "select * from product where id = ?";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				result = new Product();
				result.setId(id);

				String name = rs.getString(2);
				float price = rs.getFloat(3);

				result.setName(name);
				result.setPrice(price);

			}

			ps.close();

			c.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	@Test
	public void fun(){
		System.out.println(new ProductDAO().countAll());
	}
	
	public int countAll(){
		int res=0;
		try {
			Connection c = DBUtil.getConnection();

			String sql = "select count(*) from product";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				res= (int) rs.getLong(1);
			}

			ps.close();

			c.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	public List<Product> ListProduct() {
		List<Product> products = new ArrayList<Product>();

		try {
			Connection c = DBUtil.getConnection();

			String sql = "select * from product order by id asc";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Product product = new Product();
				int id = rs.getInt(1);
				String name = rs.getString(2);
				float price = rs.getFloat(3);

				product.setId(id);
				product.setName(name);
				product.setPrice(price);
				products.add(product);

			}

			ps.close();

			c.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}

	public List<Product> ListProduct(int page, int size) {
		List<Product> products = new ArrayList<Product>();

		try {
			Connection c = DBUtil.getConnection();

			String sql = "select * from product order by id asc limit ?,?";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, (page) * size);
			ps.setInt(2, size);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Product product = new Product();
				int id = rs.getInt(1);
				String name = rs.getString(2);
				float price = rs.getFloat(3);

				product.setId(id);
				product.setName(name);
				product.setPrice(price);
				products.add(product);

			}

			ps.close();

			c.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}
}