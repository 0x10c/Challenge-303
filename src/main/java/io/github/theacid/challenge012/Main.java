package io.github.theacid.challenge012;


class MultiplicationTable {
    public static void main(String args[]) {
        int columns, lines;

        System.out.println("Multiplication Table 1 - 100:\n ");

        for(lines = 1; lines <= 10; lines++) {
            for(columns = 1; columns <= 10; columns++) {
                System.out.print(lines * columns + "\t");
            }
        }
        System.out.println();
    }
}
