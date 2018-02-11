package io.github.theacid.challenge018;

import java.util.Scanner;

class DecimalToOctal {
	private static int decimal;
	private static String octal;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Type a decimal number: ");
		decimal = scanner.nextInt();
		
		System.out.println(decimal + " in octal is: " + convertToOctal(decimal));
	}

	private static String convertToOctal(int decimal) {
		octal = Integer.toOctalString(decimal);
		return octal;
	}
}
