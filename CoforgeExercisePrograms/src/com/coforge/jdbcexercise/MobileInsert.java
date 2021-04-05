package com.coforge.jdbcexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MobileInsert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// String sql = "insert into student values('Rajat',1234,'Delhi')";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";
		Statement statement = null;
		Connection connection = null;

		try(Scanner src = new Scanner(System.in);) {
			connection = DriverManager.getConnection(url, username, password);

			statement = connection.createStatement();

			for (int count = 0; count < 3; count++) {
				System.out.println("Enter Data");
				String model = src.next();
				int id = src.nextInt();
				String brand = src.next();
				int price = src.nextInt();
				String sql = "insert into mobile values ('" + model + "'," + id + ",'" + brand + "'," + price + ")";
				boolean result = statement.execute(sql);
				System.out.println("value inserted: " + result);

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
