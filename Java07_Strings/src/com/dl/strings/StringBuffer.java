package com.dl.strings;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("Hello java and python");
		
		
		//mutable (synchronized)
		StringBuffer sb=new StringBuffer() ;
		//sb=new StringBuffer(s1);
		//System.out.println(sb);
		
		//mutable (non-synchronized)
		StringBuilder sbb=new StringBuilder(s1);
		sbb.append("poi");
		System.out.println(sbb);
		
	}

}
