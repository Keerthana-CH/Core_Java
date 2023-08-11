package com.dl.thiskeyword;

public class ThisMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethod eg1 = new ThisMethod();
		//System.out.println(eg1.add(90, 34));
		System.out.println(eg1.addition(23L, 23L));
	}

	public int add(int a, int b) {
		//System.out.println(this.addition(45L, 21L));
		return a+b;
	}
	public long addition(long a, long b) {
		System.out.println(this.add(45, 21));
		return a+b;
	}
	
	public String userDetails(String uname, String password) {
		return uname+password;
	}
	
}
