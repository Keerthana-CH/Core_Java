package com.dl.supepr;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b=new B();
		b.m1();
	}

}

class A{
	
	//instance v
	int a=20;
	int b=90;
}

class B extends A{
	//instance v
	int a=90;
	int b=12;
	
	//instance methods
	public void m1() {
		System.out.println("B:"+a);
		System.out.println("Bsuper:"+super.a);
	}
}