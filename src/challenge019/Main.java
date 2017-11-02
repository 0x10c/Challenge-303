package challenge019;

import java.util.Scanner;

public class Main {
	private static Integer binary;
	private static String octal;
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
		Main main = new Main(); 
		main.getValue();
		main.convert();
	}
}
