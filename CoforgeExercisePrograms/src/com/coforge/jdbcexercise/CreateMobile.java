package com.coforge.jdbcexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateMobile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sql = "create table mobile(model varchar(20),mob_id integer primary key,brand varchar(20),price integer)";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";
		Statement statement = null;
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, username, password);

			statement = connection.createStatement();

			boolean result = statement.execute(sql);
			System.out.println("table created " + result);

		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
}
