package challenge023;

import java.util.Scanner;

public class Main {
	public static boolean result(int a, int b, int c) {
		return ((a + b) == c || (b + c) == a || (a + c) == b);
	}
	
	public static void main(String[] args) {
		int i, j, k;
		Scanner putValue = new Scanner(System.in);
		
		System.out.print("Enter first value: ");
		i = putValue.nextInt();
		
		System.out.print("Enter second value: ");
		j = putValue.nextInt();
		
		System.out.print("Enter third value: ");
		k = putValue.nextInt();
		
		System.out.println("Result: " + result(i, j, k));
		System.out.print("\n");
	}
}
