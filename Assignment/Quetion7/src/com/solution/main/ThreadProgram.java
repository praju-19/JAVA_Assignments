
/*Write a Java program that creates two threads. The first thread should print even
 numbers between 1 and 10, and the second thread should print odd numbers
 between 1 and 10*/


package com.solution.main;


 class EvenThread extends Thread{
	 
	public void run(){
		 for(int i=1;i<=10;i++) {
			 if(i%2 == 0) {
				 System.out.println("Even Number are :"+ i);
			 }
		 }
	 }
	 
 }
 
 class OddThread extends Thread{
	 
		public void start(){
			 for(int i=1;i<=10;i++) {
				 if(i%2 == 1) {
					 System.out.println("Odd Number are :"+ i);
				 }
			 }
		 }
		 
	 }
 

public class ThreadProgram {

	public static void main(String[] args) {
		
		EvenThread e = new EvenThread();
		e.run();
		
		System.out.println();
		
		OddThread o = new OddThread();
		o.start();
		
	}

}
