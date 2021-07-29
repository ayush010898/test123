package com.telstra;

class DemoConstructor {
	int number;
	String name;
	DemoConstructor() {
		System.out.println("Default Const called");
	}
	DemoConstructor(int number, String name){ //constructor overloading
		this.name = name;
		this.number = number;
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		DemoConstructor obj = new DemoConstructor();  //calls default constructor
		DemoConstructor obj1 = new DemoConstructor(10,"Ayush"); //calls overloaded constructor
		System.out.println(obj.name);
		System.out.println(obj.number);
		System.out.println(obj1.name);
		System.out.println(obj1.number);

	}

}
