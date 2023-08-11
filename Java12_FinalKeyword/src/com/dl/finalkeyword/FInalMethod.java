package com.dl.finalkeyword;

public class FInalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();
		b.m1();
		
		
		//POly
		A a=new B();
		a.m1();

	}

}


class A{
	public final void m1() {
		System.out.println("FInal method");
	}
}

class B extends A{
	//	public void m1() {
	//		//.....Cannot Override final method
	//	}
}
