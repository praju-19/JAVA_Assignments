package com.solution.main;

import java.util.Scanner;

import com.solution.controller.BankImpl;

class check{
	public void StartAtm() {
		
		System.out.println("***************Welcome To Our Bank *****************");
		System.out.print("Please Select Your option \n1.Check Bank Balence\n2.Diposite amout\n3.Woithdraw Amout\n ");
	      Scanner sc = new Scanner(System.in);
		int option;
		System.out.print("enter a option::");
		option = sc.nextInt();
		BankImpl B = new BankImpl(5000) ;
		switch(option) {
		case 1 : B.bankBalence();
		 break;
		case 2 : B.deposite();
		 break;
		case 3 : B.withdraw();
		 break;
		case 4 : System.out.println("Thank you for visiting our Bank ....");
		 break;
		default :
			System.out.println("Invalid option please try Again...");
			break;
		
		}
	}
	
}


public class Start {
	

	public static void main(String[] args) {
		check c = new check();
		c.StartAtm();
	}

}
