package io.github.theacid.challenge104;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CopyArrayList {
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
        listOfElements2.add("JSE");
        listOfElements2.add("ASP.NET");

        System.out.println("First ArrayList: " + listOfElements);
        System.out.println("Second ArrayList: " + listOfElements2);

        Collections.copy(listOfElements, listOfElements2);

        // After copying first 4 elements from listOfElements
        // are replaced with first 4 elements from listOfElements2
        System.out.println("Both ArrayLists: " + listOfElements);
    }
}
