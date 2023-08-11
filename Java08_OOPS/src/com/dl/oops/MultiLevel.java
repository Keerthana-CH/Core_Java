package com.dl.oops;

//MultiLvel
class GrandParent {
	
	void m1() {
		System.out.println("GrandParent Class");
	}

}


class Parent1 extends GrandParent{
	
	void m2() {
		System.out.println("Parent Class");
	}
	
	
}

class Child1 extends Parent1{
	void m3() {
		System.out.println("Child Class");
	}
	void m4() {
		System.out.println("overided parent method");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child=new Child();
		child.m1();
		child.m2();
		child.m4();
		
		
	}

}
