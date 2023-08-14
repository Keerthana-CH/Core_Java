package com.dl.abstraction3;

public class Eg3 extends Eg2 {

	@Override
	public void m3() {
		System.out.println("M3 method");
	}

	@Override
	public void m4() {
		System.out.println("M4 method");

	}
	
	public static void main(String[] args) {
		
		Eg3 eg3=new Eg3();
		eg3.m1();
		eg3.m2();
		eg3.m3();
		eg3.m4();
		
		Eg1 eg33=new Eg3();
		eg33.m1();
		eg33.m2();
		eg33.m3();
		eg33.m4();
	}

}
