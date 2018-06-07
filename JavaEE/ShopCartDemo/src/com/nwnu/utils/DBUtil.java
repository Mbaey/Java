package com.nwnu.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	private static String url;
	private static String username;
	private static String password;

	static {
		try {
			InputStream is = DBUtil.class.getResourceAsStream("/db.properties");

			Properties ps = new Properties();
			ps.load(is);
			String driverClassName = ps.getProperty("driverClassName");
			url = ps.getProperty("url");
			username = ps.getProperty("username");
			password = ps.getProperty("password");

			Class.forName(driverClassName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	public static void main(String[] args) throws SQLException {
		System.out.println(getConnection());
	}
}