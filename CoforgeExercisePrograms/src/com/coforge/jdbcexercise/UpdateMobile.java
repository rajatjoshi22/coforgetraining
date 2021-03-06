package com.coforge.jdbcexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateMobile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";
		Statement statement = null;
		Connection connection = null;

		try(Scanner src=new Scanner(System.in);) {
			connection = DriverManager.getConnection(url, username, password);

			statement = connection.createStatement();

			boolean result =true;
			String choice=null;
			String sql=null;
			System.out.println("Enter choice to update model|brand|price");
			choice=src.next();
			System.out.println("Enter mobile id");
			int id=src.nextInt();
			if(choice.equals("m")) {
				String model=src.next();
				sql="update mobile set model='"+model+"' where mob_id="+id;
				statement.execute(sql);
				
				System.out.println("updated table " + result);
			}
			else if(choice.equals("b")) {
				String brand=src.next();
				sql="update mobile set brand='"+brand+"' where mob_id="+id;
				statement.execute(sql);
				
				System.out.println("updated table " + result);
			}
			else if(choice.equals("p")){
				int price=src.nextInt();
				sql="update mobile set price='"+price+"' where mob_id="+id;
				statement.execute(sql);
				
				System.out.println("updated table " + result);
			}
			else {
				System.out.println("Wrong choice !!!");
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
