package challenge000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RectArea {
    public static void main(String[] args) throws IOException {
        double width, height, area;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a length of rectangle: ");
        width = Double.parseDouble(reader.readLine());
        System.out.println("Enter a width of rectangle: ");
        height = Double.parseDouble(reader.readLine());

        area = width * height;
        System.out.println("Area of rectangle with " + width + " width and " + height + " height is: ");
        System.out.println(area);
    }
}
