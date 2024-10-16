package com.solution.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.solution.data.Student;

public class SelectApp {

	
		static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public Student  selectData(int id) {
			Connection connection = null;
			PreparedStatement pstmt = null;
			ResultSet resultset = null;
			Student std = null;
			
			try {
				connection = DriverManager.getConnection("jdbc:mysql:///school", "root", "root123");

				String selectQuery = " Select id,name,age,city from Class_A where id = ?";

				if (connection != null) {
					pstmt = connection.prepareStatement(selectQuery);
				}

				if(pstmt != null) {
					pstmt.setInt(1, id);
					
					resultset = pstmt.executeQuery();
				}
				if(resultset != null) {
					   std = new Student();
					   
						while(resultset.next()) {
					   std.setId(resultset.getInt(1));
					   std.setName(resultset.getString(2));
					   std.setAge(resultset.getInt(3));
					   std.setCity(resultset.getString(4));
						}
					
					    return std; 
					}


			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (pstmt != null) {
						pstmt.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		return std;
		

		
		}	
		


	}


