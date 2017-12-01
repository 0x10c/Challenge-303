package io.github.theacid.challenge107;

import java.util.ArrayList;
import java.util.List;

class ExtractFromArrayList {
    public static void main(String[] args) {
        List<String> listOfElements = new ArrayList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("Before: " + listOfElements);

        List<String> subList = listOfElements.subList(1, 4);
        System.out.println(subList);
    }
}