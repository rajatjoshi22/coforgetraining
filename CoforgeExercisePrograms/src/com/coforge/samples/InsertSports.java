package com.coforge.samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertSports {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";
		PreparedStatement statement = null;
		Connection connection = null;

		try (Scanner src = new Scanner(System.in);) {
			connection = DriverManager.getConnection(url, username, password);

			String sql = "insert into sports values(?,?,?,?)";
			statement = connection.prepareStatement(sql);
			for (int count = 0; count < 2; count++) {
				System.out.println("Enter details");
				int sport_Id = src.nextInt();
				String sportName = src.next();
				int totalPlayer = src.nextInt();
				String trainer = src.next();
				statement.setInt(1, sport_Id);
				statement.setString(2, sportName);
				statement.setInt(3, totalPlayer);
				statement.setString(4, trainer);

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
