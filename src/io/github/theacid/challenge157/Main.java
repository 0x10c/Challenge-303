package io.github.theacid.challenge157;

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

        System.out.println("Key values: " + listOfElements.keySet());
        System.out.println("Values: " + listOfElements.values());
    }
}
