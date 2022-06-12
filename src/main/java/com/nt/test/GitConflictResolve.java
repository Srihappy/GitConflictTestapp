package com.nt.test;

public class GitConflictResolve {

	static int a=10;
	static int b=30;
	public static void main(String[] args) {
	
		
		addition();					
		multiplication(); 
		
	}

	private static void addition() {
		System.out.println("Addition");
		System.out.println("Addition: "+a+b);		
	}

	private static void multiplication() {
		int c=a*b;
		System.out.println("its Multiplication");
		System.out.println("Multiplication: "+a*b);	
		System.out.println(c);
	}

}
