package challenge025;

import java.io.IOException;
import java.util.Scanner;

class RectangleArea {
    private double height, width, area;
    Scanner inputValues = new Scanner(System.in);

    private void readValues() throws IOException {
        System.out.println("Height: ");
        height = Double.parseDouble(inputValues.nextLine());
        System.out.println("Width: ");
        width = Double.parseDouble(inputValues.nextLine());
    }

    private void calculate() {
        area = height * width;
    }

    private void result() {
        System.out.println("Area of rectangle with height " + height + ", and width: " + width + " is: ");
        System.out.printf("%2.2f", area);
    }

    public static void main(String[] args) throws IOException {
        RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.readValues();
        rectangleArea.calculate();
        rectangleArea.result();
    }
}
