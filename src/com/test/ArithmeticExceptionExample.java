package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionExample {

	
	int c;
	public int checkException() {
		
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		 int a = sc.nextInt();
		 int b = 0;
		 
		 c=a/b;
		 sc.close();
		 
		 
		 
		}
		catch (ArithmeticException  | InputMismatchException e) {
		e.printStackTrace();
		System.out.println("Enter Integer value only");
		}
		return c;
		
		
			 
		
	}
}
