package com.dl.strings;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Methods
		//1. concat
		String s1="Keerthana";
		String s2="Chilupuri";
		
		
		String s3=s1.concat(s2);// A new reference is getting created
		System.out.println(s3);
		
		String s4="KeerthanaChilupuri";
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));
		
		String s5=s1+s2;// A new reference is getting created
		System.out.println(s5==s4);//false     
		System.out.println(s5.equals(s4));
		
		//
		String s10="Java";
		System.out.println(s10.toLowerCase());
		System.out.println(s10.toUpperCase());
		
		//
		String s11="JAVA";
		System.out.println(s10.equalsIgnoreCase(s11));
		System.out.println(s10.compareTo(s11));
		System.out.println(s10.compareToIgnoreCase(s11));
	
		//
		String ss="Java Backend , Python Backend , JavaScript Backend";
		System.out.println(ss.indexOf("Backend"));
		System.out.println(ss.indexOf('B'));
		System.out.println(ss.indexOf("Backend",10));
		
		//
		String sss="Hello Java and Hello Python";
		System.out.println(sss.startsWith("H"));
		System.out.println(sss.startsWith("Hel"));
		System.out.println(sss.endsWith("n"));
		System.out.println(sss.endsWith("hon"));
		System.out.println(sss.endsWith("Hello"));
		System.out.println(sss.contains("an"));
		
		//
		String t="a b c v d b d b d";
		System.out.println(t.charAt(0));
		
		String tt=t.replace('b', 'n');
		System.out.println(tt);
		
		String tt1=t.replaceAll("b", "mm");
		System.out.println(tt1);
		
		String tt2=t.replaceFirst("b", "mm");
		System.out.println(tt2);
		
		String tt3=t.replaceAll("b", "mm");
		System.out.println(tt3);
		
		//
		char[] charArray = t.toCharArray();
		System.out.println(charArray);
		charArray[4]='4';
		System.out.println(charArray);
	}

}