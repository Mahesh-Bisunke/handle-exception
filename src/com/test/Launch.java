package com.test;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1:");
		int num1 = sc.nextInt();
		System.out.println("Enter number2:");
		int num2 = sc.nextInt();
		System.out.println(num1+num2);
	}
}
