package com.training.jdbcpreparedemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class InsertPrepare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// String sql = "insert into student values('Rajat',1234,'Delhi')";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";
		PreparedStatement statement = null;
		Connection connection = null;

		try(Scanner src = new Scanner(System.in);) {
			connection = DriverManager.getConnection(url, username, password);
            String sql="insert into costudent values(?,?,?)";
			statement = connection.prepareStatement(sql);
            statement.setString(1,"Rajat");
            statement.setInt(2, 123);
            statement.setString(3,"Delhi");
            statement.execute();
            
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
