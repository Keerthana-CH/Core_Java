package com.dl.oops;

//Eg1 internally extends Object class
public class Eg1 extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Eg1 eg1 = new Eg1();
		eg1.m1();
		
		new Eg1().m1();
	}

	 void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1 Method");
	}

}
