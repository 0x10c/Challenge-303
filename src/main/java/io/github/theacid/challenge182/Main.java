package io.github.theacid.challenge182;

import java.util.ArrayList;
import java.util.List;
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

        System.out.println("\nAfter adding: ");
        for (Object vectors : vector) {
            System.out.println(vectors);
        }

        aList.add("Cobol");
        aList.add("NodeJS");

        vector.addAll(3, aList);

        System.out.println("\nBefore adding: ");
        for (Object vectors : vector) {
            System.out.println(vectors);
        }
    }
}
