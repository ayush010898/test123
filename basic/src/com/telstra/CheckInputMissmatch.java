package com.telstra;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInputMissmatch {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		
		int age = 0;
		double salary = 0.0;
		String name = "";
		
		System.out.println("enter the details");
		
		try {
			age = x.nextInt();
			salary = x.nextDouble();
			name = x.next();
			
			System.out.println("age :" +age+ " salary :" +salary+ " name :" +name);
			
		}
		catch(InputMismatchException ime) {
			ime.printStackTrace();
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
	}
}
