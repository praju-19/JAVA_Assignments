package com.solution.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {

	static {
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("Driver loaded succefully");
			
  }

	public static Connection getConnection() throws SQLException {
		String user = "root";
		String password = "root123";
		String url = "jdbc:mysql://localhost:3306/school";
		
		Connection connection = DriverManager.getConnection(url,user,password);
		System.out.println("Connection established Succesfully");

	    return connection;
		
	}
	
	public static void cleanup(Connection connection , Statement statement , ResultSet resultSet ) throws SQLException {
		 if(resultSet != null) 
  	      resultSet.close();
  	  
  	  if(statement != null) 
			statement.close();
  	  
  	  if(connection != null) 
			connection.close();
  	  
			System.out.println("Connection closed");
		 
	 }
	 
	
}
