package io.github.theacid.challenge165;

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

        System.out.println("For 10 value is: " + listOfElements.floorKey(10));
        System.out.println("For 25 value is: " + listOfElements.floorKey(25));
        System.out.println("For 59 value is: " + listOfElements.floorKey(59));
    }
}
