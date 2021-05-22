package com.simplilearn.typecasting;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		// Calculator
		
		Scanner input = new Scanner(System.in);

		System.out.println("********************************");
		System.out.println("Welcome to the Calculator");
		System.out.println("********************************");
		System.out.println("Please enter the Number Value:");
		
		System.out.println("Number 1: ");
		int num1 = input.nextInt();
		
		System.out.println("Number 2: ");
		int num2 = input.nextInt();
		
		System.out.println("Addition:"  +add(num1, num2));
		System.out.println("Substraction:" +sub(num1, num2));
		System.out.println("Multiplication:"  +mul(num1, num2));
		System.out.println("Division:"  +div(num1, num2));
		System.out.println("Averag:"  +avg(num1, num2));
	}

	public static byte add(int num1, int num2) {
		return (byte) (num1 + num2);
	}
	public static short sub(int num1, int num2) {
		return (short) (num1 - num2);
	}
	public static double mul(int num1, int num2) {
		return num1 * num2;
	}
	public static float div(int num1, int num2) {
		return num1 / num2;
	}
	public static double avg(int num1, int num2) {
		return (num1 + num2)/2;
	}
}
