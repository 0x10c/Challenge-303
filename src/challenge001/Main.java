package challenge2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		double firstValue, secondValue, result;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first value: ");
		firstValue = Double.parseDouble(reader.readLine());
		System.out.println("Enter a second value: ");
		secondValue = Double.parseDouble(reader.readLine());
		result = firstValue%secondValue;
		
		System.out.println("The rest of the division from: " + firstValue + " to " + secondValue + " is: " + result);
	}
}
