package challenge020;

import java.util.Scanner;

class CompareNumbers {
	public static void main(String[] args) {
		int firstNumber, secondNumber;
		@SuppressWarnings("resource")
		Scanner putValue = new Scanner(System.in);
		
		System.out.print("Enter a first value: ");
		firstNumber = putValue.nextInt();
		
		System.out.print("Enter a second value: ");
		secondNumber = putValue.nextInt();
		
		if(firstNumber == secondNumber) {
			System.out.println(firstNumber + " = " + secondNumber);
		}
		else if (firstNumber > secondNumber) {
			System.out.println(firstNumber + " > " + secondNumber);
		}
		else if(firstNumber < secondNumber) {
			System.out.println(firstNumber + " < " + secondNumber);
		}
		else {
			System.out.println(firstNumber + " != " + secondNumber);
		}
	}
}
