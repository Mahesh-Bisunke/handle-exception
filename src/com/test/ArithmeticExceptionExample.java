package com.test;

import java.util.Scanner;

public class ArithmeticExceptionExample {

	public int checkException() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		 int a = sc.nextInt();
		 int b = 0;
		 
		 int c=a/b;
		 sc.close();
		 return c;
		 	 
		
	}
}
