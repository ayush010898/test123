package com.telstra;

public class ArithmeticExceptionExample {

	 public static void main(String[] args) {
	int i=10;
	int j=0;

	// int Z=i/j; // 10/0
	//
	// System.out.println(Z);
	//
	// System.out.println("never divide a number by Zero");
	try {
	int Z=i/j;
	System.out.println(Z);
	}catch(ArithmeticException e) {
	System.out.println("i have catch the exception");
	System.out.println(e);
	e.getMessage();
	e.printStackTrace(); // details of Exception
	System.out.println("never divide a number by Zero");
	}
	}

	}