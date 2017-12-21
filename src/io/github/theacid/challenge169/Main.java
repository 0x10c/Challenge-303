package io.github.theacid.challenge169;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> listOfElements = new TreeMap<>();
        listOfElements.put(1, "Java");
        listOfElements.put(11, "Scala");
        listOfElements.put(21, "Golang");
        listOfElements.put(22, "C#");
        listOfElements.put(41, "C");
        listOfElements.put(61, "C++");
        listOfElements.put(71, "Elixir");

        System.out.println("Original TreeMap: " + listOfElements);

        System.out.println("Values with keys between 20 - 60: " + listOfElements.subMap(20, true, 60, true));

    }
}
