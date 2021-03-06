package com.coforge.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Updatedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	     link and load driver
//	     establish a connection
//			String sql = "update student set name='Rajat' where stud_Id=1234";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "system";
			Statement statement = null;
			Connection connection = null;
           
			try(Scanner src=new Scanner(System.in);) {
				connection = DriverManager.getConnection(url, username, password);
//			     create a statement object and add the query
				statement = connection.createStatement();
//			      execute the statement
				System.out.println("Choose the field to change name or city");
				String choice=src.next();
				System.out.println("Enter your id");
				int id=src.nextInt();	
				String sql=null;
				 boolean result=true;
				if(choice.equals("c")) {
					String city=src.next();
					sql="update student set city='"+city+"' where stud_Id="+id;
					result=statement.execute(sql);
					System.out.println("value updated: " + result);
				}
				else if(choice.equals("n")) {
					String name=src.next();
					sql="update student set name='"+name+"' where stud_Id="+id;
					result=statement.execute(sql);
					System.out.println("value updated: " + result);
				}else {
					System.out.println("Wrong choice");
				}
				
				System.out.println("Enter id to delete");
				id=src.nextInt();
				sql="delete from student where stud_Id="+id;
				result=statement.execute(sql);
				System.out.println("value deleted :"+result);

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
