package com.telstra;

public class VariableTest {
	int x = 20;
	static int y = 35;
	public void methodOne() {
		int val = 10;
		System.out.println(val);
		y = y + 5;
	}

	public static void main(String[] args) {
		VariableTest vt = new VariableTest();
		vt.methodOne();
		System.out.println(vt.x);

	}

}

