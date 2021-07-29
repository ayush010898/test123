package com.telstra;

class ParentA1 {
	//private int a = 10;
	public void firstMethod() {
		System.out.println("parent class mathod");
	}
}

class ChildA extends ParentA1 {
	public void childMethod() {
		System.out.println("child class mathod");
	}
}

public class MultiInheritance {

	public static void main(String[] args) {
		ChildA ca = new ChildA();
		ca.firstMethod();
		//System.out.println(ca.a);  cannot access private of parent class
		ca.childMethod();
		
		ParentA1 pa = new ChildA();
		pa.firstMethod();    //we can only access parent method from parent object of child class
	}

}
