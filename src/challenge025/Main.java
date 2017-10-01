package challenge025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RectangleArea {
    private double height, width, area;

    private void readValues() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Height: ");
        height = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Width: ");
        width = Double.parseDouble(bufferedReader.readLine());
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
