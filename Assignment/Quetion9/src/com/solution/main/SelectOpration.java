
/*Write a Java program that connects to a MySQL database using JDBC. The program
 should read data from a table and display the results in the console.*/


package com.solution.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.solution.util.JDBCUtil;

public class SelectOpration {

	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement pstmt = null ;
		ResultSet resultSet = null;
		
		String SqlSelectQuery = "SELECT * FROM CLASS_A WHERE ID = ?";
		
		try {
			connection = JDBCUtil.getConnection();
			
			pstmt = connection.prepareStatement(SqlSelectQuery);
			
			Scanner sc = new Scanner(System.in);
            System.out.print("Enter id to get the data :: ");
            int id = sc.nextInt();
            
            pstmt.setInt(1, id);
            
			resultSet = pstmt.executeQuery();
			System.out.println("ID\tNAME\tAGE\tCITY");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
						+ "\t" + resultSet.getString(4));
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		finally {
			try {
				JDBCUtil.cleanup(connection, pstmt, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


	}

}
