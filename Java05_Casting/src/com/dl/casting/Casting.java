package com.dl.casting;

public class Casting {

	//Types of Casting
	//Implicit : Low to High
	//Explicit : High to Low
	//Order    : byte-short-int-long-float-double
						  //char

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implicit Casting
		byte b1=92;
		short s=b1;
		System.out.println(s);
		
		int i=s;
		System.out.println(i);
		
		long l=i;
		System.out.println(l);
		
		float f=l;
		System.out.println(f);
		
		double d=f;
		System.out.println(d);
		
		char c='A';
		int ii=c;
		System.out.println(ii);
		
		
	}

}
