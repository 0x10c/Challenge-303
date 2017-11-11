package challenge019;

import java.util.Scanner;

class BinaryToOctal {
	private static Integer binary;
	private static Scanner scanner = new Scanner(System.in);
	
	private void getValue() {
		System.out.println("Type a binary number: ");
		binary = Integer.parseInt(scanner.nextLine(), 2);
	}
	
	private static void convert() {
		String octal = Integer.toOctalString(binary);
		System.out.println("Octal value is: " + octal);
	}
	
	public static void main(String[] args) {
		BinaryToOctal binaryToOctal = new BinaryToOctal();
		binaryToOctal.getValue();
		binaryToOctal.convert();
	}
}
