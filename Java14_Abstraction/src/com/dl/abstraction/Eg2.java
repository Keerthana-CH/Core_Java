package com.dl.abstraction;

public class Eg2 extends Eg1 {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of abs method m2");

	}

	public static void main(String[] args) {
		Eg2 eg2=new Eg2();
		eg2.m1();
		eg2.m2();
		m3();
		
		
		//In order to achieve polymorphism
		Eg1 eg1=new Eg2();
		eg1.m2();
	}
}
