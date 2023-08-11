package com.dl.cntrlstmts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IterationsBuffer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String range=input.readLine();
		int n=Integer.parseInt(range);
		

		for(int i=0;i<n;i++) {
			System.out.println(i);
		}
		
		
		//While loop
		System.out.println("While loop");
		while(n>0) {
			System.out.println(n);
			n--;
		}
	}

}
