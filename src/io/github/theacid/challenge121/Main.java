package io.github.theacid.challenge121;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> listOfElements = new LinkedList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("Before: " + listOfElements);
        Collections.swap(listOfElements, 0, 2);

        System.out.println("After: " + listOfElements);
    }
}
