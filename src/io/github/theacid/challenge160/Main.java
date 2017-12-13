package io.github.theacid.challenge160;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> listOfElements = new TreeMap<>();
        listOfElements.put(0, "Java");
        listOfElements.put(3, "Scala");
        listOfElements.put(5, "Golang");
        listOfElements.put(7, "C#");
        listOfElements.put(8, "C");
        listOfElements.put(9, "C++");
        listOfElements.put(10, "Elixir");

        System.out.println("First: " + listOfElements);

        TreeMap<Integer, String> listOfElements2 = new TreeMap<>();
        listOfElements2.put(2,"Spring");
        listOfElements2.put(4,"JEE");
        listOfElements2.put(6,"Golang");
        listOfElements2.put(1,"ASP.NET");

        System.out.println("Second: " + listOfElements2);

        listOfElements.putAll(listOfElements2);
        System.out.println("All elements: " + listOfElements);
    }
}
