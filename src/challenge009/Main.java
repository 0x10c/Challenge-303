package challenge009;

public class Main {
	public static void main(String[] args) {
		int macierz[][] = new int[10][10];
		int sum, i = 0, j = 0;
		
		for(i = 0; i < 10; i++) {
			for(j = 0; j < 10; j++) {
				if(i == j) 
					macierz[i][j] = 1;
				else
					macierz[i][j] = 0;
			}
		}
		
		for(i = 0; i < 10; i++) {
			for(j = 0; j < 10; j++) {
				System.out.println(macierz[i][j] + " ");
			}
		}
		
		sum = 0;
		for(i = 0; i < 10; i++) {
			sum = sum + macierz[i][i];
		}
		System.out.println("Suma elementów: " + sum);
	}
}
