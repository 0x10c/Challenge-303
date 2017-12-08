package io.github.theacid.challenge140;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> listOfElements = new HashSet<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("Before: " + listOfElements);
        listOfElements.clear();

        if(listOfElements.isEmpty()) {
            System.out.println("List empty.");
        }
        else {
            System.out.println("Ok!");
        }

    }
}
