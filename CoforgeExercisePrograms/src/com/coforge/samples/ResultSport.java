package com.coforge.samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSport {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";
		PreparedStatement statement = null;
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, username, password);
//             String sql="select * from sports";
			String sql="select * from sports where trainer=?";
			statement = connection.prepareStatement(sql);
			statement.setString(1,"sachin" );
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				int sport_Id=rs.getInt("Sport_id");
				String sport_Name=rs.getString("SportName");
				int totalPlayer=rs.getInt("totalPlayer");
				String trainer=rs.getString("trainer");
				System.out.println(sport_Id+"\t"+sport_Name+"\t"+totalPlayer+"\t"+trainer);
			}

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
