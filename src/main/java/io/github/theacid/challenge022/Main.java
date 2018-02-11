package io.github.theacid.challenge022;

public class Main {
    public static void main(String[] args) {
    	// The sum of the numbers in the columne on the right has been added
		// for divide by 3 and 5
		int result = 0;

    	System.out.println("\nDivided by 3: ");
    	for(int i = 0; i <= 100; i++) {
    		if(i % 3 == 0) {
    			System.out.print(i + " ");
    		}
    	}

    	System.out.println("\nDivided by 5: ");
    	for(int i = 0; i <= 100; i++) {
    		if(i % 5 == 0) {
    			System.out.print(i + " ");
    		}
    	}

    	System.out.println("\nDivided by 3 and 5: ");
    	for(int i = 0; i <= 1001; i++) {
    		if(i % 3 == 0 && i % 5 == 0) {
    			System.out.print(i + " ");
				System.out.print("Sum of previous numbers: ");
				System.out.println(result += i);
    		}
    	}
    }
}
