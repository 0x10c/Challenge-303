package io.github.theacid.challenge164;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> listOfElements = new TreeMap<>();
        listOfElements.put(3, "Java");
        listOfElements.put(0, "Scala");
        listOfElements.put(6, "Golang");
        listOfElements.put(5, "C#");
        listOfElements.put(4, "C");
        listOfElements.put(2, "C++");
        listOfElements.put(1, "Elixir");

        System.out.println("First (smallest) key: " + listOfElements.firstKey() + ". Last (largest) key: " + listOfElements.lastKey());

    }
}
