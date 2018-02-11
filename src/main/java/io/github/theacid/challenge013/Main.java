package io.github.theacid.challenge013;

class MultiplicationTable {
    public static void main(String[] args) {
        int columns, lines = 1;

        System.out.println("Multiplication Table 1 - 100:\n ");
        do {
            columns = 1;
            do {
                System.out.print(columns * lines + "\t");
                columns++;
            }
            while(columns <= 10);
            lines++;
        }
        while(lines <= 10);
    }
}
