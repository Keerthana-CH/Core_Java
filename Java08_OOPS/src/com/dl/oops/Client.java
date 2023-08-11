package com.dl.oops;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		UserImpl client =new UserImpl();
		client.userBanKDetails("SBI", 723647389);
		client.userDetails("keerthana", "02");
		UserImpl.userOrderDetails("4321", "Hyd");
	}

}
