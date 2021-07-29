package com.telstra;

@FunctionalInterface
interface FunctionalInterfaceEx {
	public String saySomething();
}

public class Demo2Lambda { //implements FunctionalInterfaceEx    //for when we need without lambda
	
//	@Override   //for without lambda we need to implement interface
//	public String saySomething() {
//		return "without lambda";
//	}

	public static void main(String[] args) {

//		Demo2Lambda d1 = new Demo2Lambda();
//		System.out.println(d1.saySomething());
		
		FunctionalInterfaceEx fi = () -> {return "with lambda"; };
		System.out.println(fi.saySomething());
	}

}
