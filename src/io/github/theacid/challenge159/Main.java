package io.github.theacid.challenge159;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> listOfElements = new TreeMap<>();
        listOfElements.put(1, "Java");
        listOfElements.put(2, "Scala");
        listOfElements.put(3, "Golang");
        listOfElements.put(4, "C#");
        listOfElements.put(5, "C");
        listOfElements.put(6, "C++");
        listOfElements.put(7, "Elixir");

        System.out.println("TreeSet values: " + listOfElements);

        if(listOfElements.containsKey(3) && listOfElements.containsValue("Scala")) {
            System.out.println("Key " + listOfElements.ceilingEntry(3) + " and value " + listOfElements.ceilingEntry(2));
        }
        else {
            System.out.println("Kay and value does not exist.");
        }
    }
}
