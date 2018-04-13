package io.github.theacid.challenge110;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> listOfElements = new ArrayList<>();
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

        List<String> joined = Stream.concat(listOfElements.stream(), listOfElements2.stream()).collect(Collectors.toList());
        System.out.println("First list: " + listOfElements);
        System.out.println("Second list: " + listOfElements2);
        System.out.println("Joined: " + joined);
    }
}
