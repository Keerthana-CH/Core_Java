package com.dl.cntrlstmts;

import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//SCP Area
		//Scanner is using heap area, here we are comparing 1 object and 1 literal
		//But in Python it is sharing only one memory location always
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Uersname");
		String userName=sc.nextLine();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Password");
		String password=sc1.nextLine();
		
		if(userName==new String("Admin") && password== new String("1234")) { 
			System.out.print("Login Success");
		}
		else {
			System.out.println("Login Failure");
		}
		
		if(userName.equals("Admin") && password.equals("1234")) { 
			System.out.println("Login Success");
		}
		else {
			System.out.println("Login Failure");
		}
		sc.close();
		sc1.close();
		
		String userName1="Admin";
		String password1="1234";
		if(userName1=="Admin" && password1== "1234") { 
			System.out.println("Login Success");
		}
		else {
			System.out.print("Login Failure");
		}
	}

}
