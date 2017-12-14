package io.github.theacid.challenge112;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> listOfElements = new ArrayList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("Before adding new element: " + listOfElements);

        String newElement = "Rust";

        listOfElements.add(5, newElement);
        System.out.println("ArrayList with new element: " + listOfElements);
    }
}
