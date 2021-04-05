package com.training.jdbcpreparedemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sql = "create table costudent(name varchar(20),stu_id integer primary key,city varchar(20))";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";
		PreparedStatement statement = null;
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, username, password);

			statement = connection.prepareStatement(sql);
			System.out.println("created :"+statement.execute());

		

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
