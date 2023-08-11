package com.dl.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Polymorphism: Having many forms
		//method overloading
		MethodOverloading obj=new MethodOverloading();
		obj.m1(10, 100);
		obj.m1(20L, 3);
	}
	
	public void m1(int a, int b) {
		System.out.println(a);
		System.out.println(b);

	}
	public void m1(long a, int b) {
		System.out.println(a);
		System.out.println(b);

	}
}

