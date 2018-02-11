package io.github.theacid.challenge144;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> listOfElements = new TreeSet<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("First set: " + listOfElements);


        Set<String> listOfElements2 = new TreeSet<>();
        listOfElements2.add("ASP.NET");
        listOfElements2.add("JEE");
        listOfElements2.add("Spring");
        listOfElements2.add("Iris MVC");

        System.out.println("Second set: " + listOfElements2);


        listOfElements.addAll(listOfElements2);
        System.out.println("All elements in one: "  + listOfElements);

    }
}
