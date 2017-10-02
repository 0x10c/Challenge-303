package challenge012;


class MultiplicationTable {
    public static void main(String args[]) {
        int n = 10, columns, lines;

        System.out.println("Multiplication Table 1 - 100:\n ");

        for(lines = 1; lines <= n; lines++) {
            for(columns = 1; columns <= n; columns++) {
                System.out.print(lines * columns + "\t");
            }
        }
        System.out.println();
    }
}
