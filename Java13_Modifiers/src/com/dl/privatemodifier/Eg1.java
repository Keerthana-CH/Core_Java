package com.dl.privatemodifier;

public class Eg1 {
	
	private int a=10;
	private int b=100;
	
	
	public void m1() {
		System.out.println(a+b);
	}
	
	private void m2() {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Eg1().a);
		Eg1 obj=new Eg1();
		obj.m1();
		obj.m2();
		
	}

	
}
