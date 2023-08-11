package com.dl.Elements;

public class EleVar02 {
	
	int b=9;
	//System.out.println("l");
	 
	static int c=10;						//Static var
	static void exM(){
		System.out.println(c);
	}
	
	public void exM2(){
		c=30;
		System.out.println(c);              //static variales can be accessed from anywhere in the class.
		System.out.println(new EleVar02().b);				//Instance variables are directly accessible by instance methods
		System.out.println(b);
	}
	
	//(main method is also static)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c=20;
		System.out.println(new EleVar02().b); //9
		System.out.println(c);				//10//static variables are Directly accessible .
		exM();								//10//static methods are Directlyy accessible.
		//exM3();
		EleVar02 eg1=new EleVar02();   	//Instance Variable to access non-static variables or methods.
		eg1.exM2();							//10//9
		int c=2;							//Local Variable
		System.out.println(c);				//2
		new EleVar02().exM2();				//10//9
		
		//Static methods and static variables are accessed by another static methods also as ClasssName.MethodName() or ClassName.VariableName
	}
	

}
