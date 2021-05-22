package com.simplilearn.typecasting;

public class TypeCasting2 {

	public static void main(String[] args) {
		// Type Casting : process of converting data from one to another
		/**
		 * Narrowing: converting data from lower range value to highe rang
		 * DOUBLE->FLOAT->LONG->INT->SHORT->BYTE
		 */
		
		double decimalCount = 111.7d; //long to double
		
		long bigCount = (long) decimalCount;
		int integerCount = (int) decimalCount;
		short shortCount = (short) decimalCount;
		byte byteCount = (byte) decimalCount;
		float floatCount = (float) decimalCount;	
		
		System.out.println("Byte Count ::" +byteCount);
		System.out.println("Integer Count ::" +integerCount);
		System.out.println("Float Count ::" +floatCount);
		System.out.println("Long Count ::" +bigCount);
		System.out.println("Double Count ::" +decimalCount);
		System.out.println("short Count ::" +shortCount);
		
	}

}
