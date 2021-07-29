package com.telstra;

public class VariableTest2 {
	int x = 10;
	static int y = 20;

	public static void main(String[] args) {
		VariableTest2 vt = new VariableTest2();
		System.out.println(y);
		System.out.println(vt.x);
		System.out.println();
		vt.methodOne();
	}

	 public int methodOne() {
	 System.out.println(x);
	 System.out.println(y);
	 return 0;
	 }
}
