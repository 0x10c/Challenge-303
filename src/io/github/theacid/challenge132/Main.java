package io.github.theacid.challenge132;

import java.util.HashSet;

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

        System.out.println("Hash set contains " + listOfElements.size() + " elements.");
    }
}
