package com.dl.oops;

public class Customer {
	
	//Instance methods with args
	public void customerDetails(String name,long phoneNo) {
		System.out.println(name);
		System.out.println(phoneNo);
	}

	//Static methods with args
	public static void bankDetails(String bankName,String ifscCode,String loc) {
		System.out.println(bankName);
		System.out.println(ifscCode);
		System.out.println(loc);
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus1=new Customer();
		cus1.customerDetails("Keerthana",829489234);
		bankDetails("ICICI","119023999","Hyd");

		Customer cus2=new Customer();
		cus2.customerDetails("Sai",829489234);
		bankDetails("ICICI","119023999","Hyd");
		
		
		Customer cus3=new Customer();
		cus3.customerDetails("Vikas",829489234);
		bankDetails("ICICI","119023999","Hyd");
	}

}
