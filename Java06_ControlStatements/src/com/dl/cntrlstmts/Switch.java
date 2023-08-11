package com.dl.cntrlstmts;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int sal=sc.nextInt();
		
		
		
		switch (sal) {
		case 20000:
			
			System.out.println("Employee Salary is "+sal);
			break;
		case 30000:
			System.out.println("Employee Salary is "+sal);
			break;
		case 40000:
			System.out.println("Employee Salary is "+sal);
			break;
		default:
			System.out.println("Employee Salary is out of range");
			break;
			
		}
		sc.close();

	}

}
