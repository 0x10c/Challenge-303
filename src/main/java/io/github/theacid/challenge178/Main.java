package io.github.theacid.challenge178;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add("Java");
        vector.add("Scala");
        vector.add("Golang");
        vector.add("Elixir");
        vector.add("Python");
        vector.add("C#");

        System.out.println("Before putting element: " + vector);

        vector.add(0, "Rust");

        // Displaying all elements
//        for(int i = 0; i < vector.size(); i++) {
//            System.out.println(vector.get(i));
//        }

         System.out.println("After putting element: " + vector);
    }
}
