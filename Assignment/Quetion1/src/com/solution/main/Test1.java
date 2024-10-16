
 /*Write a Java program that uses polymorphism by defining an interface called Shape
 with methods to calculate the area and perimeter of a shape. Then create classes
 that implement the Shape interface for different types of shapes, such as circles and
 triangles.*/


package com.solution.main;

import java.util.Scanner;

interface Shape {
	 public void area();
	 public void perimeter();
 }
 class Circle implements Shape{
     float pi = 3.14f ;
     float radius;
     
     float circle(float r) {
    	 this.radius = r;
		return r;
    	 
     }
	 
	 
	 
	@Override
	public void area() {
		
	 float cArea = pi*radius*radius;
		System.out.println("Area of the circle is ::"+ cArea);
	}

	@Override
	public void perimeter() {
		
		float cPeri = 2*pi*radius;
		System.out.println("Perimeter of the circle is::"+ cPeri);
	}
	 
 }
 
 class Triangle implements Shape{
	 
	 float sA,sB,sC;

	float Triangle(float sA, float sB, float sC) {
		 this.sA  = sA;
		 this.sB = sB;
		 this.sC = sC;
		return 0 ;
		 
	 }

	@Override
	public void area() {
		float arr = ( sA +sB+sC)/2.0f;
		double tArea =  Math.sqrt(arr *(arr-sA)*(arr-sB)*(arr-sC));
		System.out.println("Area of Triangle is ::"+tArea);
		
	}

	@Override
	public void perimeter() {
		 double tPeri = (sA + sB + sC);
		System.out.println("Perimeter of Triangle is::"+tPeri);
		
	}
	 
 }

public class Test1 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
           System.out.println("//******//**** Circle ****//******");
           System.out.println();
           Circle c = new Circle();
           System.out.print("Enter a value of radius::");
           float r;
           r = sc.nextFloat();
           c.circle(r);
           c.area();
           System.out.println();
           c.perimeter();
           
           System.out.println();
           
           System.out.println("//******//**** Triangle ****//******");
           System.out.println();
           Triangle t = new Triangle();
           System.out.print("Enter a value of 1st side of triangle ::");
           float sideA = sc.nextFloat();
           System.out.println();
           System.out.print("Enter a value of 2nd side of triangle ::");
           float sideB = sc.nextFloat();
           System.out.println();
           System.out.print("Enter a value of 3rd side of triangle ::");
           float sideC = sc.nextFloat();
           System.out.println();
           t.Triangle(sideA, sideB, sideC);
           t.area();
           System.out.println();
           t.perimeter();
            
	}

}
