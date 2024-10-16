package com.solution.controller;

import java.util.Scanner;

public class BankImpl implements IBank {
      Scanner sc = new Scanner(System.in);
	  int balence;
	  
		public BankImpl(int balence) {
			this.balence = balence;
		} 
	 
	@Override
	public void deposite() {
		System.out.print("Enter a deposite Amount ::");
		int d = sc.nextInt();
		balence = balence + d;
		System.out.println("Your current balence is::"+ balence);
		
	}

	@Override
	public void withdraw() {
		System.out.print("Enter a withdraw Amount::");
		
		int w = sc.nextInt();
		
		if( w< balence) {
			 
			balence = balence - w;
			System.out.println("Your current balence is ::"+balence);
		} else {
			System.out.println("Ensuffisient Balence .....");
		}
		
	}

	@Override
	public void bankBalence() {
		 System.out.println("your current balence is::"+balence);
	}

}
