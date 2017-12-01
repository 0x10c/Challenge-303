package io.github.theacid.challenge016;

import java.util.Scanner;

class DecimalToBinary {
	private static int decimal;
	private static String binary;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Type a decimal number: ");
		decimal = scanner.nextInt();
		
		System.out.println(decimal + " in binary is: " + convertToBinary(decimal));
	}

	private static String convertToBinary(int decimal) {
		binary = Integer.toBinaryString(decimal);
		return binary;
	}
}
