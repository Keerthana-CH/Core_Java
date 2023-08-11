package com.dl.arrays;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		int a[]= {10,20,3,3};
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(Arrays.toString(a));
		
		//
		int b[]=new int[4];
		Arrays.fill(b, 10);
		System.out.println(Arrays.toString(b));
		
		//
		int aa[]= {10,20,30};
		int bb[]= {10,20,30};
		int c[]= {10,20};
		System.out.println(Arrays.equals(aa, bb));
		System.out.println(Arrays.equals(aa,c));
		System.out.println(aa[0]==bb[0]);
	
		
		//
		int d[] = {10,20,1,3,90,8};
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
	}	

}
