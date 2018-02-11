package io.github.theacid.challenge163;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> listOfElements = new TreeMap<>();
        listOfElements.put(3, "Java");
        listOfElements.put(0, "Scala");
        listOfElements.put(7, "Golang");
        listOfElements.put(5, "C#");
        listOfElements.put(8, "C");
        listOfElements.put(9, "C++");
        listOfElements.put(10, "Elixir");

        System.out.println("Unsorted: " + listOfElements);

//        Map<Integer, String> sorted = listOfElements.entrySet().
//                stream().
//                sorted((Map.Entry.comparingByValue()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    }
}
