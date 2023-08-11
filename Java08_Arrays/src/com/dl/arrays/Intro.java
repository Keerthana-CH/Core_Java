package com.dl.arrays;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrays are fixed size, once we declare we cannot increase the size
		//create an array
		int arr[]= {5,4,3,2,1};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		
		System.out.println("####################");
		//declare an array
		int arr1[] = new int[5];
		arr1[0]=1;
		System.out.println(arr1[0]); //1
		System.out.println(arr1[1]); //0
		System.out.println(arr1[2]); //0
		System.out.println(arr1[3]); //0
		System.out.println(arr1[4]); //0
		
		//
		String sarr[]= {"java","python","c++","r","k"};
		System.out.println(sarr);
		System.out.println(sarr[0]);
		System.out.println(sarr[1]);
		System.out.println(sarr[3]);
		System.out.println(sarr[2]);
		System.out.println(sarr[4]);
		
	}

}
