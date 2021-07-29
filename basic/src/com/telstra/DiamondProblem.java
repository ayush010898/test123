package com.telstra;

class ParentA {
	public void firstMethod() {
		System.out.println("parent A mathod");
	}
}

class ParentB extends ParentA implements ParentC {
	public void firstMethod() {
		System.out.println("parent B mathod");
	}

	public void interfaceMethod1() {
		// TODO Auto-generated method stub
		
	}
	
}

interface ParentC {
	public void interfaceMethod1();
}

interface ParentD {
	public void interfaceMethod2();
}

class ChildInterface implements ParentC,ParentD { // can have multiple interfaces but needs to override the method of  parent interface

	@Override
	public void interfaceMethod1() {
		
	}

	@Override
	public void interfaceMethod2() {
		
	}
	
}

interface ca extends ParentC, ParentD { //interface can extend multiple interfaces but not classes
	
}

class Child extends ParentA {  //multiple classes cannot be extended
	public void childMethod() {
	System.out.println("child class mathod");
	}
}

public class DiamondProblem {

	public static void main(String[] args) {
		

	}

}
