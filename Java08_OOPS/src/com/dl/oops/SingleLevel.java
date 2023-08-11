package com.dl.oops;


class Parent {
	
	void m1() {
		System.out.println("Parent Class");
	}
	
	void m2() {
		System.out.println("Parent Class");
	}
}

class Child extends Parent{
	void m1() {
		System.out.println("overided parent method");
	}

	void m4() {
		// TODO Auto-generated method stub
		
	}
}
public class SingleLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child=new Child();
		child.m1();
		child.m2();

	}

}
