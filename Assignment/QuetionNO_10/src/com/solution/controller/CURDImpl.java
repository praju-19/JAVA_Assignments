package com.solution.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.solution.util.JDBCUtil;

public class CURDImpl implements ICURD {
     
	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet resultset = null;
	
	Integer rowCount = null;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void Select()  {
	
		
		String SqlSelectQuery = "SELECT * FROM CLASS_A WHERE ID = ?";
		
		try {
			connection = JDBCUtil.getConnection();
		
		
		pstmt = connection.prepareStatement(SqlSelectQuery);
		
	
        System.out.print("Enter id to get the data :: ");
        int id = sc.nextInt();
        
        pstmt.setInt(1, id);
        
        resultset = pstmt.executeQuery();
       
		System.out.println("ID\tNAME\tAGE\tCITY");

		while (resultset.next()) {
			System.out.println(resultset.getInt(1) + "\t" + resultset.getString(2) + "\t" + resultset.getInt(3)
					+ "\t" + resultset.getString(4));
		}
        
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				JDBCUtil.cleanup(connection, pstmt, resultset);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


	}

		
	

	@Override
	public void Insert() {
		
	  String SqlInsertQuery = "INSERT INTO Class_A(id,name,age,city) VALUES (?,?,?,?)  ";
	  try {
		connection = JDBCUtil.getConnection();
	
		pstmt = connection.prepareStatement(SqlInsertQuery);
		
		System.out.print("ID:: ");
        int id = sc.nextInt();
        
        System.out.print(" Name :: ");
        String name = sc.next();
        
        System.out.print(" Age :: ");
        int age = sc.nextInt();
        
        System.out.print(" City :: ");
        String city = sc.next();
        
         pstmt.setInt(1, id);
		 pstmt.setString(2, name);
		 pstmt.setInt(3, age);
		 pstmt.setString(4, city);

		
         rowCount = pstmt.executeUpdate();
		
		if(rowCount != 0) {
			System.out.println("The no of rows Affected :: "+rowCount);
		}
		else {
			System.out.println("Recound insertion failed");
		}

        
       } catch (SQLException e) {
		
		 e.printStackTrace();
       }
		finally {
        	try {
				JDBCUtil.cleanup(connection, pstmt, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}
        }

		
	   }
	

	@Override
	public void Update() {
String sqlUpdateQuery = "UPDATE Class_A SET Name=?,age=?,city=? WHERE ID=?";
		
		try {
			connection = JDBCUtil.getConnection();
			
			pstmt = connection.prepareStatement(sqlUpdateQuery);
			
			Scanner sc = new Scanner(System.in);
            System.out.print("Enter id to get the data :: ");
            int id = sc.nextInt();
            
            System.out.print("Name ::");
            String name = sc.next();
            
            System.out.print("Age ::");
            int age = sc.nextInt();
           
           System.out.print("City ::");
           String city = sc.next();
            
           
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, city);
            pstmt.setInt(4, id);
            
            int rowCount = pstmt.executeUpdate();
            if(rowCount != 0) {
				System.out.println("The no of rows Affected :: "+rowCount);
			}
			else {
				System.out.println("Recound insertion failed");
			}
            
            
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				JDBCUtil.cleanup(connection, pstmt, resultset);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
		
	}

	@Override
	public void Delete() {
		
		 String sqlDeleteQuery = "DELETE  FROM Class_A WHERE ID=?";
		    
		    try {
				connection = JDBCUtil.getConnection();
				
				pstmt = connection.prepareStatement(sqlDeleteQuery);
				
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter a ID to delete Data ::");
				int id = sc.nextInt();
				
				 
				
				pstmt.setInt(1,id);
				
				 int rowsAffected = pstmt.executeUpdate();
		    		System.out.println("Query executed");

		    		if(rowsAffected != 0) {
		    			System.out.println("The no. of rows Affectd are :: "+ rowsAffected);
		    		}
		    		else {
		    			System.out.println("Data updation failed");
		    		}
		            
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		    finally {
				try {
					JDBCUtil.cleanup(connection, pstmt, resultset);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

		
		
	}


