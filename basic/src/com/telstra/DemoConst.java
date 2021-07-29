package com.telstra;

class Parent {
	Parent() {
		System.out.println("parent class constructor");
	}
	Parent(int b) {
		System.out.println(b);
	}
}

class Childs extends Parent {
	Childs() {
		System.out.println("Child class constructor");
	}
	Childs(int a){
		System.out.println(a);
	}
}

public class DemoConst {

	public static void main(String[] args) {
		new Childs(10);
		//new Parent(10);

	}

}
