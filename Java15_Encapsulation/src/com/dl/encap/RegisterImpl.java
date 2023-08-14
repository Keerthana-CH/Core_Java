package com.dl.encap;

public class RegisterImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Register user=new Register();
		user.setUsername("Keerthana");
		user.setEmail("keerthana@gmail.com");
		user.setContact(8106507359L);
		user.setAddress("Siddipet");
		
		System.out.println(user.getUsername());
		System.out.println(user.getEmail());
		System.out.println(user.getContact());
		System.out.println(user.getAddress());
	}

}
