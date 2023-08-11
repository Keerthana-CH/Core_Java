package com.dl.thiskeyword;

public class ThisConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisConstructor thisConstructor = new ThisConstructor();
		System.out.println(thisConstructor);
		
		new ThisConstructor();
	}

	public ThisConstructor() {
		this(10);
		//this(10,20);
		System.out.println("Default COnstructor");
	}
	
	public ThisConstructor(int a) {
		this(19,99);
		System.out.println(a);
	}
	public ThisConstructor(int a, int b){
		System.out.println(a+b);
	}
}
