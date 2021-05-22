package com.simplilearn.typecasting;

import java.util.Scanner;

public class StringToNumericConverter {

	public static void main(String[] args) {
		// Sting to Numeric Converter
		
		String price = "124"; // Converible value
		String price2 = "124ab"; //Non-Converible Value
		
		int priceInt = Integer.parseInt(price2);
		byte priceByte = Byte.parseByte(price2);
		double priceDouble = Double.parseDouble(price2);
		
		System.out.println("Integer Pric : "+priceInt);
		System.out.println("Byte Price: "+priceByte);
		System.out.println("Double Price : "+priceDouble);
	}

}
