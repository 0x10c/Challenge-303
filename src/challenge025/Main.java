package challenge025;

import java.util.Arrays;
import java.util.Random;

public class Main {
	private int getRandom(int random[]) {
		return random[(new Random()).nextInt(random.length)];
	}
	
	public static void main(String[] args) {
		Main newRandomArray = new Main();
		
		int elements1[] = {-5, 8, 15, 19, 21, 27, 38, 42, 50};
		int elements2[] = {3, 10, 18, 22, 25, 31, 35, 40, 44};
		
		System.out.println("First array: " + Arrays.toString(elements1));
		System.out.println("Second array: " + Arrays.toString(elements2));
		
		int elements3 = newRandomArray.getRandom(elements1);
		System.out.println("Random numbers generated from two arrays: " + elements3);
	}
}
