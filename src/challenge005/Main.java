package challenge005;

class PrintNumbers {
    public static void main(String[] args) {
        int i, k = 0, j = 0, sum = 0;

        System.out.println("With for loop: ");
        for(i = 0; i <= 50; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("With do while: ");
        do {
            System.out.println(j);
            j++;
        } while (j <= 50);
        System.out.println();

        System.out.println("With while loop: ");
        while(k <= 50) {
            System.out.println(k);
            sum = sum + k;
            k++;
        }

        System.out.println();
        System.out.println("Suma wszystkich liczb: " + sum);
    }
}
