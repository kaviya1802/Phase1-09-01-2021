package com.simplilearn.typecasting;

import java.util.Scanner;

public class StringToNumericConverter2 {

	public static void main(String[] args) {
		// Sting to Numeric Converter
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("********************************");
		System.out.println("Welcome to the Numeric Convrter");
		System.out.println("********************************");
		System.out.println("Please enter the String Number Value:");
		
		String price = input.next();
		
		int priceInt = Integer.parseInt(price);
		byte priceByte = Byte.parseByte(price);
		double priceDouble = Double.parseDouble(price);
		
		System.out.println("Integer Price : "+priceInt);
		System.out.println("Byte Price: "+priceByte);
		System.out.println("Double Price : "+priceDouble);
	}

}
