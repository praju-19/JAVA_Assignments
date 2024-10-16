
 /*Write a Java programme that takes an integer from the user and throws an exception
 if it is negative.Demonstrate Exception handling of same program as solution.*/

package com.solution.main;

import java.util.Scanner;

class Negative extends Exception {
	
}

public class ExcepationHandel {
  
	public static void main(String[] args) {
		  System.out.print("Enter a value::");
          Scanner sc = new Scanner(System.in);
           int value;
           value = sc.nextInt();
           
           try { 
        	   if(value < 0) {
        		   throw new Negative();
        		
        	   }
        	   
        	   } catch (Exception e) {
        	       System.out.println("Exception handeled value is negative :: "+ value);
           } finally {
        	   if(value>0) {
        	   System.out.println(" Number is positive:: "+ value);
        	   } else {
        		   System.out.println(" Finally bloack exicuted ");
        	   }
           }
	}

}
