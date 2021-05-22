package com.simplilearn.typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		// Type Casting : process of converting data from one to another
		/**
		 * Widening: converting data from lower range value to highe rang
		 * byte -> short -> int -> long -> float -> double
		 */
		byte byteCount = 100; //range from -128 to 127
		
		int integerCount = byteCount;
		float floatCount = byteCount;
		long bigCount = byteCount;
		double decimalCount = byteCount;
		
		System.out.println("Byte Count ::" +byteCount);
		System.out.println("Integer Count ::" +integerCount);
		System.out.println("Float Count ::" +floatCount);
		System.out.println("Long Count ::" +bigCount);
		System.out.println("Double Count ::" +decimalCount);
		
	}

}
