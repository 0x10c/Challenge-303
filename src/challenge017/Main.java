package challenge017;

import java.util.Scanner;
// decimal to hexadecimal
public class Main {
	private static int decimal;
	private static String hexadecimal;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Type a decimal number: ");
		decimal = scanner.nextInt();
		
		System.out.println(decimal + " in hexadecimal is: " + convertToHex(decimal));
	}

	private static String convertToHex(int decimal) {
		hexadecimal = Integer.toHexString(decimal);
		return hexadecimal;
	}
}
