package io.github.theacid.challenge175;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> listOfElements = new PriorityQueue<>();
        listOfElements.add("C");
        listOfElements.add("Golang");
        listOfElements.add("Java");
        listOfElements.add("Scala");

        System.out.println("Elements from first queue: " + listOfElements);

        PriorityQueue<String> listOfElements2 = new PriorityQueue<>();
        listOfElements2.add("C");
        listOfElements2.add("Golang");
        listOfElements2.add("Elixir");
        listOfElements2.add("Scala");

        System.out.println("Elements from second queue: " + listOfElements2);

        // alphabetically
        for(String elements : listOfElements) {
            System.out.println(listOfElements2.contains(elements) ? "Yes" : "No");
        }
    }
}
