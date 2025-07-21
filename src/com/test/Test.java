package com.test;

import java.util.Scanner;

public class Test {

	private double length;
	private double height;
	private double width;
	
	public Test(double length, double height,double width) {
		length =this.length;
		height =this.height;
		width = this.width;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length:");
		double length = sc.nextDouble();
		
		System.out.println("Enter height:");
		double height = sc.nextDouble();
	
		System.out.println("Enter width:");
		double width = sc.nextDouble();
		
		
		Test test = new Test(length, height, width);
		double result = test.calculateVolume(length, height, width);
	System.out.println(result);
	sc.close();	
	
	
	ArithmeticExceptionExample ac = new ArithmeticExceptionExample();
	ac.checkException();
		
	}
	
	public double calculateVolume(double length,double height, double width) {
		
		
		
		double volume =length*height*width;
		return volume;
	}
	
}
