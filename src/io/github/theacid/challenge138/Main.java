package io.github.theacid.challenge138;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> listOfElements = new LinkedHashSet<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("HashSet: " + listOfElements);

        List<String> convert = new ArrayList<>(listOfElements);
        System.out.println("ArrayList: " + convert);
    }
}
