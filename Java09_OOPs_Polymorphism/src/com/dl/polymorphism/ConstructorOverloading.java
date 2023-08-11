package com.dl.polymorphism;

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorOverloading();
		new ConstructorOverloading(20);
		new ConstructorOverloading(20, 20);
	}
	
	public ConstructorOverloading() {
		System.out.println("Def C");
	}
	
	public ConstructorOverloading(int a) {
		System.out.println(a);
	}
	
	public ConstructorOverloading(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}

}
