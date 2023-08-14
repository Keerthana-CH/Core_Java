package com.dl.abstraction4;


class A{
	public void m1() {
		System.out.println("M1 method");
	}
}

abstract class B extends A{
	public abstract void m2();
}

class C extends B{

	@Override
	public void m2() {
		System.out.println("M2 method");
	}
	
}

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c=new C();
		c.m1();
		c.m2();
		
	}

}
