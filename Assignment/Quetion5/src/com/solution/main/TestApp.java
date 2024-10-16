 /*Demonstrate the difference between abstract class and interface by writing programs
 as well as in keypoints.*/

package com.solution.main;

 abstract class Animal{
	 
	 public abstract void Name();
	 public abstract void Color();
 }
 
  class Dog extends Animal{

	@Override
	public void Name() {
		 System.out.println(" Name of animal...");
		
	}

	@Override
	public void Color() {
		System.out.println(" color of animal...");
	
	}
	  
  }
  
  interface IAnimal{
	  public void Name ();
	  public void Color();
	  
  }
  
  class AnimalImpl implements IAnimal{

  

	@Override
	public void Name() {
		System.out.println(" Name of animal...");
	
	}

	@Override
	public void Color() {
	
		System.out.println(" color of animal...");
	}
	  
  }
  
  

public class TestApp {

	public static void main(String[] args)  {
		System.out.println("******** Abstract Class **********");
		Dog d = new Dog();
		d.Name();
		d.Color();
		System.out.println();
		
		System.out.println("******** Interface Class **********");
		AnimalImpl a = new AnimalImpl();
		a.Name();
		a.Color(); 
	
	}

}
