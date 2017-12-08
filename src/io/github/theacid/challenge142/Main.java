package io.github.theacid.challenge142;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> listOfElements = new TreeSet<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        for(String elements : listOfElements) {
            System.out.println(elements);
        }
    }
}
