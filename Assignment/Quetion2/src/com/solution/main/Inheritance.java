/* Write a Java program to invoke parent class constructor from a child class. Create
 Child class object and parent class constructor must be invoked. Demonstrate by
 writing a program. Also explain key points about Constructor.*/


package com.solution.main;

class Parent{
	 
	 Parent() {
		System.out.println("Parent class constructor");
	}

	
 }
 class Child extends Parent{
	  
	 Child(){
		 super();
		 System.out.println("Child class constructor");
	 }
 }

public class Inheritance {

	public static void main(String[] args) {
		Child c = new Child();
		
		
	}

}

/* Key points about Constructor */

