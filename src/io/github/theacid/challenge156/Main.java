package io.github.theacid.challenge156;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> listOfElements = new HashMap<>();
        listOfElements.put(1, "Java");
        listOfElements.put(2, "Scala");
        listOfElements.put(3, "Golang");
        listOfElements.put(4, "C#");
        listOfElements.put(5, "C");
        listOfElements.put(6, "C++");
        listOfElements.put(7, "Elixir");

        System.out.println("Original HashMap: " + listOfElements);

        if(listOfElements.containsValue("Elixir")) {
            System.out.println("Value exist.");
        }
        else {
            System.out.println("Element does not exist.");
        }
    }
}
