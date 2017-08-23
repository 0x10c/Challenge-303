package challenge009;

public class Main {
	public static void main(String[] args) {
		int matrix[][] = new int[10][10];
		int sum, i = 0, j = 0;
		
		for(i = 0; i < 10; i++) {
			for(j = 0; j < 10; j++) {
				if(i == j)
					matrix[i][j] = 1;
				else
					matrix[i][j] = 0;
			}
		}
		
		for(i = 0; i < 10; i++) {
			for(j = 0; j < 10; j++) {
				System.out.println(matrix[i][j] + " ");
			}
		}
		
		sum = 0;
		for(i = 0; i < 10; i++) {
			sum = sum + matrix[i][i];
		}
		System.out.println("Sum of all elements: " + sum);
	}
}
