package com.training.jdbcpreparedemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class InsertDynamicPrepare {
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
//            String sql="insert into costudent values(?,?,?)";
			String sql="insert into costudent(name,stu_id) values(?,?)";
			statement = connection.prepareStatement(sql);
			for(int count=0;count<2;count++) {
				System.out.println("Enter details");
				String name=src.next();
				int id=src.nextInt();
				String city=src.next();
            statement.setString(1,name);
            statement.setInt(2,id);
//            statement.setString(3,city);
            statement.execute();
            
			}
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
