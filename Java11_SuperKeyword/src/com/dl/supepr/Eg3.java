package com.dl.supepr;

public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ITwo();
	}

}

class IOne{
	
	public IOne() {
		System.out.println("Def IOne Cons");
	}
	
	public IOne(int a) {
		System.out.println(a);
	}
}

class ITwo extends IOne{
	
	public ITwo() {
		super(10);
		System.out.println("Def ITwo Cons");
	}
}