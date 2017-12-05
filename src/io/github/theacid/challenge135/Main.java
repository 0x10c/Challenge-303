package io.github.theacid.challenge135;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

        List<String> listOfElements2 = new ArrayList<>();
        listOfElements2.add("Spring");
        listOfElements2.add("JEE");
        listOfElements2.add("Golang");
        listOfElements2.add("ASP.NET");

        for(String elements : listOfElements) {
            if(listOfElements2.contains(elements)) {
                System.out.println("The same element: " + elements);
            }
        }
    }
}
