/*Write a Java program that reads a set of integers from the user and stores them in a
 List. The program should then find the second largest and second smallest elements
 in the List.*/

package com.solution.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ListProgram {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
         
		List<Integer> number = new ArrayList<>() ;
		
		 System.out.println("Enter the Integer values in list (Enter 'Stop' to terminate the list)::");
		 
		 while(sc.hasNext()) {
			 if(sc.hasNextInt()) {
				 number.add(sc.nextInt());
	  } 			
		 else {				 
			 String input = sc.nextLine();
			 if(input.equalsIgnoreCase("Stop")) {
				 break;				
		   }else {
				 System.out.println("Invalid input");
				 }
			}
		 }
		 
		 if(number.size()<2) {
			 System.out.println("Cant find the numbers because not enough numbers");
			
		 } 
		 
		 Set<Integer> newNumber = new TreeSet<>(number);
		 
		 if(newNumber.size()<2) {
			 System.out.println("Cant find the numbers because not enough numbers");
		 }
		 
		 List<Integer> sort = new ArrayList<>(newNumber);
	
		 
		 int secondSmallest = sort.get(1);
		 int secondLargest = sort.get(sort.size()-2);
		 
		 System.out.print("Second Smallest Number is ::"+secondSmallest);
		 
		 System.out.println();
		 
		 System.out.print("Second Largest Number is ::"+secondLargest);
		 
		
		 //sc.close();
	}

}
