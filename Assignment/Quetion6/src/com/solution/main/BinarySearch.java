
/*Create a Java program that implements a binary search algorithm. The program
 should accept user input for the target value and search for it in a sorted array. The
 program should return the index of the target value if found or a message if not
 found.*/ 

package com.solution.main;

import java.util.Scanner;

public class BinarySearch {
      public static int BinarySearch(int []arr, int target){
        	int low = 0;
        	int high = arr.length - 1;
            int mid = 0;
           while(low <= high) {
            	
        	   mid = (low+high)/2;
        	  
           	
            if(arr[mid] == target) {
      		   return  mid;
        	} else if(arr[mid]< target) {
        		low = mid+1;
        	} else {
        		high = mid -1;
        	}
       }
        	 return -1 ;
          
        }
	public static void main(String[] args) {
		
           Scanner sc = new Scanner(System.in);
           
           int arr1[] = {2,5,8,9,12,14,16,17,18};
           
           System.out.print("Enter a targeted value ::");
           
           int target = sc.nextInt();
           
           int search = BinarySearch(arr1,  target);
           
           if(search == -1) {
        	   System.out.println("Target value not found");
           }else {
        	   System.out.println("Target value is found ::"+ search);
           }
	}
	
	

}
