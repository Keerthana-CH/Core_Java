package com.dl.assignments;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of units consumed in this month:");
		int domesticUnits=scanner.nextInt();
		if (domesticUnits<=100) {
			below100(domesticUnits);
		}
		else if (domesticUnits<=200) {
			below200(domesticUnits);
		}
		else if(domesticUnits>200){
			above200(domesticUnits);
		}
		scanner.close();
	}
	
	public static void below100(int units){
		double bill=0.0;
		if (units>50 && units<=100) {
			bill=50*1.95 + (units-50)*3.10;
		}
		else {
			bill=units*1.95;
		}
		System.out.println(bill);
	}
	
	public static void below200(int units){
		double bill=0.0;
		if (units>100 && units<=200) {
			bill=100*3.40 + (units-100)*4.80;
		}
		else {
			bill=units*3.40;
		}
		System.out.println(bill);
	}
	
	public static void above200(int units){
		double bill=0.0;
		if (units>800) {
			bill=200*5.10 + 100*7.70 + 100*9.0 + 400*9.50 + (units-800)*10.0;
		}
		else if (units>400 && units<=800) {
			bill=200*5.10 + 100*7.70 + 100*9.0 + (units-400)*9.50;
		}
		else if (units>300 && units<=400) {
			bill=200*5.10 + 100*7.70 + (units-300)*9.0;
		}
		else if (units>200 && units<=300) {
			bill=200*5.10 + (units-200)*7.70;
		}
		else {
			bill=units*5.10;
		}
		System.out.println(bill);
	}

}
