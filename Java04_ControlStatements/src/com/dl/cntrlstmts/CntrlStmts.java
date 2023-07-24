package com.dl.cntrlstmts;
import java.util.*;
public class CntrlStmts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Types of Statements
		//Selection Statements (Eg: if,else if, else)
		//Iteration Statements (Eg: foe, while, do while)
		//Transfer Statements  (Eg: break,continue)
		
		//DEAD_CODE
		
		if(true) {
			System.out.println("else01 is deadcode");
		}
		else {
			System.out.println("else01 is deadcode");
		}
		
		if(false) {
			System.out.println("if02 is deadcode");
		}
		else {
			System.out.println("if02 is deadcode");
		}
		
		String s1="l";
		String s="l";//new String("l");
		s="k";
		System.out.println(s);
		
		int a[]=new int[9];
		System.out.println(a[0]);
		
		//Casting is not required
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();
		sc.close();
	}

}
