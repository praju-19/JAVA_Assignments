
/*Write a Java program that uses JDBC to implement a simple CRUD (create, read,
 update, delete) application. The program should */

package com.solution.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.solution.controller.CURDImpl;

public class CURDOpration {

	public static void main(String[] args) {
	
		System.out.println("********** CURD OPRATION **********");
		
		System.out.println(" Options to select Opration::\n1.Get Data\n2.Insert DATA\n3.Update the Data\n4.Delete the Data");
		System.out.print("Enter a Option ::");
		Scanner sc = new Scanner(System.in);
		
		CURDImpl c = new CURDImpl();
		
		int option;
		
	    option = sc.nextInt();
	    
	    if(option==1) {
	    	c.Select();
	    } else if(option==2) {
	    	c.Insert();
	    } else if(option==3) {
	    	c.Update();
	    }else if(option==4) {
	    	c.Delete();
	    } else {
	    	System.out.println("Invalid Option please tray again....");
	    }
		
		

	}

}
