package com.dl.supepr;

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two eg2=new Two();
		eg2.m3();
	}

}
class One{
	
	public void m1() {
		System.out.println("M1 Method");
	}
}

class Two extends One{

	public void m2() {
		super.m1();
		System.out.println("M2 Method");
	}
	
	public void m3() {
		this.m2();
		System.out.println("M3 Method");
	}
}
