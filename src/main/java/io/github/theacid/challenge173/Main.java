package io.github.theacid.challenge173;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> listOfElements = new PriorityQueue<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");
        System.out.println("Before: " + listOfElements);

        listOfElements.add("Fortran");

        System.out.println("After: " + listOfElements);
    }
}
