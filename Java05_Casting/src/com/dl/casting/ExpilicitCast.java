package com.dl.casting;

public class ExpilicitCast {

	//Explicit : High to Low
	//Order    : double-float-long-int-short-byte
						  		 //char
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=90.9992323;
		System.out.println(d);
		float f=(float)d;
		System.out.println(f);
		
		long l=(long)f;
		System.out.println(l);
		
		int i=(int)f;
		System.out.println(i);
		
		short s=(short)i;
		System.out.println(s);
		
		//Case1: converting xml data
		

	}

}
