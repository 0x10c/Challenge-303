package io.github.theacid.challenge161;

import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> listOfElements = new TreeMap<>();
        listOfElements.put(0, "Java");
        listOfElements.put(3, "Scala");
        listOfElements.put(5, "Golang");
        listOfElements.put(7, "C#");
        listOfElements.put(8, "C");
        listOfElements.put(9, "C++");
        listOfElements.put(10, "Elixir");

        System.out.println("First: " + listOfElements.keySet());

        // or

        Set<Integer> keyValues = listOfElements.keySet();
        for(Integer keys : keyValues) {
            System.out.println(keys);
        }
    }
}
