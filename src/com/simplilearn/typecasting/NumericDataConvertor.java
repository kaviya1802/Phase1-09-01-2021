package com.simplilearn.typecasting;

import java.util.Scanner;

public class NumericDataConvertor {

	public static void main(String[] args) {
		// Numeric Data Converter
		
		//1. Collect user input
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("********************************");
		System.out.println("Welcome to the Numeric Convrter");
		System.out.println("********************************");
		System.out.println("Please enter the Interger Value:");
		
		int userIn = input.nextInt();
		
		//2. Convert values into different values
		
		long bigCount = userIn;
		float floatCount = userIn;
		double decimalCount = userIn;
		short shortCount = (short) userIn;
		byte byteCount = (byte) userIn;
		
		//3. Print the converted values
		
		System.out.println("User enterd value: "+userIn);
		System.out.println("Long Count: "+bigCount);
		System.out.println("Float Count: "+floatCount);
		System.out.println("Double Count: "+decimalCount);
		System.out.println("Byte Count ::" +byteCount);
		System.out.println("short Count ::" +shortCount);
	}

}
