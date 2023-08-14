package com.dl.abstraction;

public abstract class Eg1 {
	
	public void m1() {
		System.out.println("M1 Non Abs Method");
	}
	
	public abstract void m2();
	
	public static void m3() {
		System.out.println("Static Method cannot be declared as Abstract");
	}

	
	public static void main(String[] args) {
		
		//Eg1 eg1=new Eg1();// can't initiate abstract class
		//eg1.m1();
		m3();
	}
}
