package challenge022;

public class Main {	
    public static void main(String[] args) {
 
    	System.out.println("\nDivided by 3: ");
    	for(int i = 0; i < 100; i++) {
    		if(i % 3 == 0) {
    			System.out.print(i + " ");
    		}
    	}
    	
    	System.out.println("\nDivided by 5: ");
    	for(int i = 0; i < 100; i++) {
    		if(i % 5 == 0) {
    			System.out.print(i + " ");
    		}
    	}
    	
    	System.out.println("\nDivided by 3 and 5: ");
    	for(int i = 0; i < 100; i++) {
    		if(i % 3 == 0 && i % 5 == 0) {
    			System.out.print(i + " ");
    		}
    	}
    }
}
