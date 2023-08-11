package com.dl.polymorphism;


public class MethodOverriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Child obj1=new Child();
		obj1.m1();
		Child.m2();
		
		//Polymorphism
		Parent obj=new Child();
		obj.m1();
		Parent.m2();
	}
	

}

class Parent{
	
	public void m1() {
		System.out.println("Parent");
	}
	
	public static void m2() {
		System.out.println("Static method Parent");
	}
}

class Child extends Parent{
	public void m1() {
		System.out.println("Child");
	}
	
	public static void m2() {
		System.out.println("Static method Child");
	}
}