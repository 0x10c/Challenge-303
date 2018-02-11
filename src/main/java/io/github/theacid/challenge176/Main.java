package io.github.theacid.challenge176;

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

        System.out.println("Head element from first list: " + listOfElements.peek());
        System.out.println("Removing head element from second list: " + listOfElements2.poll());
        System.out.println("Queue after removing: " + listOfElements2);
    }
}
