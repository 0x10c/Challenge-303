package io.github.theacid.challenge166;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> listOfElements = new TreeMap<>();
        listOfElements.put(1, "Java");
        listOfElements.put(11, "Scala");
        listOfElements.put(21, "Golang");
        listOfElements.put(31, "C#");
        listOfElements.put(41, "C");
        listOfElements.put(61, "C++");
        listOfElements.put(71, "Elixir");

        System.out.println("Original TreeMap: " + listOfElements);

        System.out.println("Values for keys less or equal to 20: " + listOfElements.headMap(20, true));
        System.out.println("Values for keys less or equal to 50: " + listOfElements.headMap(50, true));

    }
}
