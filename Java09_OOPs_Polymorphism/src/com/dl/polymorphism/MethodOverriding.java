package com.dl.polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method overriding : same class same dataypes of args
		B ob=new B();
		ob.m1(19,29);
		ob.m1(34, 34, 34);
		
		//Only parent class methods can be accessed
		A on=new B();
		on.m1(23, 0, 0);
		on.m2(45, 23);
		//on.m2(23, 340,344);
		//on.m3(23,23);
		
		
	}


}
class A{
	public void m1(int a, int b,int c) {
		System.out.println("A:"+a);
		System.out.println("A:"+b);
		System.out.println("A:"+c);

	}
	
	public void m2(int a, int b) {
		System.out.println("a+b ="+(a+b));

	}
}

class B extends A{
	public void m1(int a, int b) {
		System.out.println("B:"+a);
		System.out.println("B:"+b);

	}
	
	public void m2(int a, int b,int c) {
		System.out.println("a+b+c ="+(a+b+c));

	}
	public void m3(int y,int x) {
		System.out.println("Hello , this is child");
	}
}

