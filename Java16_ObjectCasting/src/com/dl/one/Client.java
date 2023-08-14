package com.dl.one;

class Big{
	public void m1() {
		System.out.println("M1 method Big");
	}
}

class Small extends Big{
	public void m1() {
		System.out.println("M2 method Small");
	}
}
public class Client {

	public static void main(String[] args) {
		
		//Inheritance
		Small small = new Small();
		small.m1();
		
		//POly
		Big big=new Small();
		big.m1();
		
		
		//Object Casting
		
		//DownCasting
		Small small2 = new Small();
		Big big2=small2;
		big2.m1();
		
		//UpCasting
		Big  big3=new Small();
		Small small3=(Small) big3;
		small3.m1();
		
	}

	
}
