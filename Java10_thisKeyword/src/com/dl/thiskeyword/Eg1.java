package com.dl.thiskeyword;

public class Eg1 {

	
	//properties
	
	int userId;
	String userName;
	String userEmail;
	String userAddress;
	
	
	//using this keyword refers to the cureent class variables
	public Eg1(int userId, String userName, String userEmail, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
	}
	
	//the assignment to variable userName has no effect
	//The output will be default values
//	public Eg1(int userId, String userName, String userEmail, String userAddress) {
//		userId = userId;
//		userName = userName;
//		userEmail = userEmail;
//		userAddress = userAddress;
//	}
	
	//Without using this keyword and we if we want to get assigned values then we have to use differnet varables as args
//	public Eg1(int uId, String uName, String uEmail, String uAddress) {
//		userId = uId;
//		userName = uName;
//		userEmail = uEmail;
//		userAddress = uAddress;
//	}
	

	public void display() {
		System.out.println(userId);
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(userAddress);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eg1 eg1 = new Eg1(1, "keerthana", "kk@gmail.com", "Siddipet");
		eg1.display();
	}

}
