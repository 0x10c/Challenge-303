package challenge026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class QuadraticFunction {
    private double a, b, c, x1, x2, delta;
    private char square_roots;

    private void readValues() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a: ");
        a = Double.parseDouble(bufferedReader.readLine());

        if(a == 0) {
            System.out.println("a cannot be equals to 0");
            System.exit(1);
        }
        else {
            System.out.println("Enter b: ");
            b = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Enter c: ");
            c = Double.parseDouble(bufferedReader.readLine());
        }
    }

    private void calculate() {
        delta = b * b - 4 * a * c;
        if(delta < 0) {
            square_roots = 0;
        }
        if(delta == 0) {
            square_roots = 1;
        }
        if(delta > 0) {
            square_roots = 2;
        }

        switch(square_roots) {
            case 1: x1 = -b/(2 * a);
            break;
            case 2: {
                x1 = (-b - Math.sqrt(delta)/(2 * a));
                x2 = (-b + Math.sqrt(delta)/(2 * a));
            }
            break;
        }
    }

    private void result() {
        System.out.printf("For value a: " + "%2.2f,\n", a);
        System.out.printf("For value b: " + "%2.2f,\n", b);
        System.out.printf("For value c: " + "%2.2f,\n", c);

        switch (square_roots) {
            case 0:
                System.out.println("No square root");
                break;
            case 1:
                System.out.printf("x1: " + "%2.2f ", x1);
                break;
            case 2: {
                System.out.printf("x1: " + "%2.2f,\n", x1);
                System.out.printf("x2: " + "%2.2f", x2);
            }
            break;
        }
    }

    public static void main(String[] args) throws IOException {
        QuadraticFunction quadraticFunction = new QuadraticFunction();
        quadraticFunction.readValues();
        quadraticFunction.calculate();
        quadraticFunction.result();
    }
}
