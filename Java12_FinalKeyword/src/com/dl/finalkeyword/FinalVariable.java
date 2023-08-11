package com.dl.finalkeyword;

public class FinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new FinalVariable().m1();

	}

	
	public void m1() {
		
		final int f=10;
		System.out.println(f);
		//f=290; If a variable declared as a final then it can't be reassigned
		System.out.println(f);
	}
}
