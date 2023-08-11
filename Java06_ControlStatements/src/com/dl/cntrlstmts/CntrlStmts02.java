package com.dl.cntrlstmts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CntrlStmts02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//stream reader converts console input to bytes then gives to bufferedreader
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the age");
		String s=reader.readLine();
		System.out.println(s);
		
	}

}
