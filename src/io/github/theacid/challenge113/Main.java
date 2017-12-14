package io.github.theacid.challenge113;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> listOfElements = new ArrayList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("Before adding new element: " + listOfElements);

        listOfElements.set(5, "Rust");

        System.out.println("Replacing C++ with Rust.");
        int arrayListSize = listOfElements.size();

        for(int i = 0; i < arrayListSize; i++) {
            System.out.println(listOfElements.get(i));
        }
    }
}
