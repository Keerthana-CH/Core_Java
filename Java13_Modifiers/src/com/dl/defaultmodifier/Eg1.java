package com.dl.defaultmodifier;

import com.dl.defaultmodifier.Eg1;

public class Eg1 {

	int a=10;
	int b=100;
	
	
	void m1() {
		System.out.println(a+b);
	}
	
	void m2() {
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
