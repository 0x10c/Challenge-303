package challenge021;

import java.util.Scanner;

// compare two Integers
public class Main {
	public static void main(String[] args) {
		Integer firstNumber, secondNumber;
		int result;
		Scanner putValue = new Scanner(System.in);

		
		System.out.print("Enter a first value: ");
		firstNumber = putValue.nextInt();
		
		System.out.print("Enter a second value: ");
		secondNumber = putValue.nextInt();
		
		result = firstNumber.compareTo(secondNumber);
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
