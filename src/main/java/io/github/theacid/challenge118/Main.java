package io.github.theacid.challenge118;

import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        LinkedList<String> listOfElements = new LinkedList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("First element: " + listOfElements.getFirst()
                + " last element: " + listOfElements.getLast()
                + " 5 element: " + listOfElements.get(5));
    }
}
