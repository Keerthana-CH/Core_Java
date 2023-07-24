package com.dl.cntrlstmts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CntrlStmts02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stream reader converts console input to bytes then gives to bufferedreader
		BufferedReader reade=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the age");
		String userAge=reade.readLine();
		System.out.println(userAge);
		
	}

}
