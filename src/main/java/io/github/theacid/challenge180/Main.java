package io.github.theacid.challenge180;

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

        Object array[] = new Object[6];
        vector.copyInto(array);

        System.out.println("Copied vector elements: ");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
