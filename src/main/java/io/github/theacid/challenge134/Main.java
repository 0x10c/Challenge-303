package io.github.theacid.challenge134;

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

        HashSet<String> clone;
        clone = (HashSet)listOfElements.clone();

        System.out.println(clone);
    }
}
