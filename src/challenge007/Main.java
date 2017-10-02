package challenge007;

class MultiplicationTable {
    public static void main(String[] args) {
        int line, column;

        for(line = 1; line <= 100; line++) {
            for(column = 1; column <= 100; column++) {
                System.out.print(line*column + "\t");
            }
        }
        System.out.println();
    }
}
