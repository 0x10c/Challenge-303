package io.github.theacid.challenge172;

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
        System.out.println("Elements from first queue: " + listOfElements);

        PriorityQueue<String> listOfElements2 = new PriorityQueue<>();
        listOfElements2.add("Spring");
        listOfElements2.add("JEE");
        listOfElements2.add("Golang");
        listOfElements2.add("ASP.NET");
        System.out.println("Elements from second queue: " + listOfElements2);
        listOfElements2.addAll(listOfElements);

        // alphabetically
        System.out.println("All elements: " + listOfElements2);
    }
}
