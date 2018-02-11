package io.github.theacid.challenge146;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> listOfElements = new TreeSet<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("First element: " + listOfElements.first() + "\nLast element: " + listOfElements.last());
    }
}
