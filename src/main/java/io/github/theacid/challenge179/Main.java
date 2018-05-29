package io.github.theacid.challenge179;

import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector();
        ArrayList aList = new ArrayList();

        vector.add("Java");
        vector.add("Scala");
        vector.add("Golang");
        vector.add("Elixir");
        vector.add("Python");
        vector.add("C#");

        aList.add("Rust");
        aList.add("JavaScript");

        System.out.println("Vector: " + vector);
        System.out.println("ArrayList: " + aList);

        vector.addAll(aList);

        System.out.println("'Vectorized' ArrayList: ");
        for(int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

    }
}
