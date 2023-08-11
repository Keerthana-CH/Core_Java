package com.dl.cntrlstmts;
import java.util.Scanner;
public class IterationsScanner {
	
	//Iteration Statements
	//for,while,do-while

	static Scanner scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		
		//for loop
		for(int i=0;i<n;i++) {
			System.out.println(i);
		}
		
		int i=0;
		for(System.out.println("\n"+n);i<n;i++) {
			System.out.println(i);
		}
		
		
		
		
//		for(i<6;i++) {
//			System.out.println(i);
//		}
		
		//While loop
		System.out.println("While loop");
		while(n>0) {
			System.out.println(n);
			n--;
		}
		
		//do while loop
		do {
			System.out.println("Do while");
			
		}while(false);
		
	}

}
