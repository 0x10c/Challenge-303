package io.github.theacid.challenge153;

import java.util.HashMap;
import java.util.Map;

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

        System.out.println("List 1: " + listOfElements);

        HashMap<Integer, String> listOfElements2 = new HashMap<>();
        listOfElements2.put(8, "ASP.NET");
        listOfElements2.put(9, "JEE");
        listOfElements2.put(10, "Spring");
        listOfElements2.put(11, "Iris MVC");

        System.out.println("List 2: " + listOfElements2);

        listOfElements.putAll(listOfElements2);

        System.out.println("All elements: ");
        for(Map.Entry elements : listOfElements.entrySet()) {
            System.out.println(elements.getKey() + " " + elements.getValue());
        }
    }
}
