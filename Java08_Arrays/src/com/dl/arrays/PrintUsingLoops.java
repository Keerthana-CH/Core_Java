package com.dl.arrays;

public class PrintUsingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		int i=0;
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
		
		System.out.println();
		i=0;
		do {
			System.out.println(a[i]);
			i++;
		}while(i<a.length);
		
		System.out.println();
		for(int j:a) {
			System.out.println(j);
		}
	}

}
