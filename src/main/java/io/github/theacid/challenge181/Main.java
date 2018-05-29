package io.github.theacid.challenge181;

import java.util.List;
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

        List sub = vector.subList(3, 5);

        // displaying elements from sub
        System.out.println("Sublist elements: ");
        for(Object elements : sub) {
            System.out.println(elements);
        }

        // Remove item with index 0 from sublist
        Object removed = sub.remove(0);
        System.out.println("\nElement: " + removed + " was removed");

        System.out.println("\nAfter removing: ");
        for(Object vectors : vector) {
            System.out.println(vectors);
        }
    }
}
