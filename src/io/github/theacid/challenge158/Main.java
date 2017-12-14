package io.github.theacid.challenge158;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> listOfElements = new TreeMap<>();
        listOfElements.put(1, "Java");
        listOfElements.put(2, "Scala");
        listOfElements.put(3, "Golang");
        listOfElements.put(4, "C#");
        listOfElements.put(5, "C");
        listOfElements.put(6, "C++");
        listOfElements.put(7, "Elixir");

        System.out.println("TreeSet values: " + listOfElements);

        // or

        for(Map.Entry<Integer, String> newEntry : listOfElements.entrySet()) {
            System.out.println(newEntry.getKey() + ". " + newEntry.getValue());
        }
    }
}
