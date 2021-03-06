package com.coforge.samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateSports {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sql = "create table sports(sport_Id integer primary key,sportName varchar(30),totalPlayer integer,Trainer varchar(30))";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";
		PreparedStatement statement = null;
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, username, password);

			statement = connection.prepareStatement(sql);
			System.out.println("created :" + statement.execute());

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
