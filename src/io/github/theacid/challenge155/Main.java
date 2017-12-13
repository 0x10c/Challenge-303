package io.github.theacid.challenge155;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> listOfElements = new HashMap<>();
        listOfElements.put("Java", 1);
        listOfElements.put("Scala", 2);
        listOfElements.put("Golang", 3);
        listOfElements.put("C#", 4);
        listOfElements.put("C", 5);
        listOfElements.put("C++", 6);
        listOfElements.put("Elixir", 7);

        System.out.println("Original HashMap: " + listOfElements);

        if(listOfElements.containsKey("Golang")) {
            System.out.println("Golang is here! Position: " + listOfElements.get("Golang"));
        }
        else {
            System.out.println("Element does not exist.");
        }
    }
}
