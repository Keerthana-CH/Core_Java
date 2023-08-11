package com.dl.cntrlstmts;

public class TransferSts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Transfer Statements
		
		//continue
		for(int i=0;i<10;i++) {
			if(i==6) {
				continue;//skips the next statements for this iteration
			}
			System.out.println(i);
		}
		
		//break
		for(int i=0;i<10;i++) {
			if(i==6) {
				break;//Stops the iteration
			}
			System.out.println(i);
		}
	}

}
