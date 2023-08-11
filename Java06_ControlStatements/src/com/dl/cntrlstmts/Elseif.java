package com.dl.cntrlstmts;
import java.util.Scanner;
public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		double sal=sc.nextDouble();
		
		if (sal==30000) {
			System.out.println("Employee Salary is "+sal);
		}
		else if (sal==30000) {
			System.out.println("Employee Salary is "+sal);
		}
		else if (sal==25000) {
			System.out.println("Employee Salary is "+sal);
		}
		else if (sal==40000) {
			System.out.println("Employee Salary is "+sal);
		}
		else {
			System.out.println("Employee Salary is out of range");
		}
		sc.close();
	}

}
