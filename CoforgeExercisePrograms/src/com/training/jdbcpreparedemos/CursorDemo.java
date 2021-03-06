package com.training.jdbcpreparedemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CursorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";
		Statement statement = null;
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, username, password);
            String sql="select * from costudent";
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs =statement.executeQuery(sql);
			rs.afterLast();
			while(rs.previous()) {
				String name=rs.getString("name");
				int stu_id=rs.getInt("stu_id");
				String city=rs.getString("city");
				System.out.println(name+"\t"+stu_id+"\t"+city);
			}
			rs.absolute(3);
			System.out.println(rs.getString("name")+"\t"+rs.getInt("stu_id")+"\t"+rs.getString("city"));

		

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
