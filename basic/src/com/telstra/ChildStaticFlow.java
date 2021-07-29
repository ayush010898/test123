package com.telstra;

public class ChildStaticFlow extends StaticControlFlow{

	// 1. Identification of static members form Parent to Child.
	// 2. Execution of static variables assignment and static blocks from Parent to Child.
	// 3. Execution of child main() method.
	static int oneNumber = 10;
	static{
	childfirstMethod();
	System.out.println("child static block");
	}
	public static void main(String[] args){
	childfirstMethod();
	System.out.println("child main Method executed....");
	}
	public static void childfirstMethod(){
	System.out.println(twoNumber);
	}
	static{
	System.out.println("second static block");
	}
	static int twoNumber = 20;
	}