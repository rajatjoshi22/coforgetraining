package com.coforge.jdbcexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Resultdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sql = "select * from mobile";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";
		Statement statement = null;
		Connection connection = null;
		ResultSet rs=null;

		try {
			connection = DriverManager.getConnection(url, username, password);

			statement = connection.createStatement();

			rs = statement.executeQuery(sql);
			while(rs.next()) {
				String model=rs.getString(1);
				int mob_id=rs.getInt(2);
				String brand=rs.getString(3);
				int price=rs.getInt(4);
				System.out.println(model+"\t"+mob_id+"\t" +brand+"\t"+price);
				
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
}
