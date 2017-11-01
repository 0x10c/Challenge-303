package challenge015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner inputValue = new Scanner(System.in);
    	System.out.println("Type a number: ");
    	
    	long number = inputValue.nextLong();
    	System.out.println("The sum of the digits is: " + sumDigits(number));;
    }

	private static int sumDigits(long number) {
		int sum = 0;
		
		while(number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
}
