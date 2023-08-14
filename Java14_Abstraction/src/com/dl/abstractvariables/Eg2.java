package com.dl.abstractvariables;

public class Eg2 extends Eg1 {

	public static void main(String[] args) {
		System.out.println(b);
		
		Eg1 eg1 = new Eg2();
		eg1.a=50;
		System.out.println(eg1.a);
		
		Eg2 eg2 = new Eg2();
		eg2.a=90;
		System.out.println(eg2.a);
		System.out.println(eg1.a);
		
	}
}
