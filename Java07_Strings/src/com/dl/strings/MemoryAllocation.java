package com.dl.strings;

public class MemoryAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SCP (String Constant Pool), it will present in the heap area
		//equals method can be used for content comparision
		//"==" is compares memory location of objects
		String s1="hello";
		String s2="hello";
		String s3="Hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//1 in heap area and another in pool area
		String s5= new String("hello");
		String s4= new String("hello");
		System.out.println(s5==s4);
		System.out.println(s5.equals(s1));
		
		

	}

}
