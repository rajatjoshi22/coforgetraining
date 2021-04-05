package com.coforge.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     link and load driver
//     establish a connection
		String sql = "create table student(name varchar(20),stud_Id integer primary key,city varchar(20))";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";
		Statement statement = null;
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, username, password);
//		     create a statement object and add the query
			statement = connection.createStatement();
//		      execute the statement
			boolean result = statement.execute(sql);
			System.out.println("table created " + result);

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
