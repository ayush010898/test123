package com.telstra;

public class StaticControlFlow {
	// 1. Identification of static variable form top to bottom.
	// 2. Execution of static variables assignment and static blocks from top to bottom.
	// 3. Execution of main method.
	static int firstNumber = 10; // 10
	static{
	firstMethod();
	System.out.println("Parent first static block");
	}
	public static void main(String[] args){
	firstMethod();
	System.out.println("Parent main Method executed....");
	}
	public static void firstMethod(){
	System.out.println("parent variable :" +secondNumber);
	}
	static {
	System.out.println("parent 1st variable :"+firstNumber);
	System.out.println("Parent second static block");
	}
	static int secondNumber = 20; // 20
	}