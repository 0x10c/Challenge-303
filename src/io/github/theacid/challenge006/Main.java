package io.github.theacid.challenge006;

import java.util.Random;

class RandomValues {
	public static void main(String[] args) {
		int generatedNumbers = 5, i;
		double number, sum = 0, minValue, maxValue;
		
		System.out.println("Code generate " + generatedNumbers + " numbers from 0 to 99");
		
		Random random = new Random();
		minValue = Math.round(100*(random.nextDouble()));
		System.out.println("Generated numbers " + minValue);
		maxValue = minValue;
		sum = sum + maxValue;
		
		for(i = 1; i <= generatedNumbers - 1; i++) {
			number = Math.round(100*(random.nextDouble()));
			System.out.println(number + ", ");
			if(maxValue < number) maxValue = number;
			if(number < minValue) minValue = number;
			
			sum = sum + number;
		}
		
		System.out.println("Maximum value: " + maxValue);
		System.out.println("Minimum value: " + minValue);
		System.out.println("Sum of generated numbers: " + sum);
	}
}
