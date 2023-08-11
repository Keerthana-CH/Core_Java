package com.dl.general;

import com.dl.protectedone.Eg1;

public class Eg6 extends Eg1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a is protected
		System.out.println(new Eg6().a);
		
		//extends relation is needed
		System.out.println(new Eg1().a);
	}

}
