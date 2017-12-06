package io.github.theacid.challenge136;

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

        System.out.println("HashSet: " + listOfElements);

        String arrayListOfElements[] = new String[listOfElements.size()];
        listOfElements.toArray(arrayListOfElements);

        //System.out.println("Array: " + arrayListOfElements);
        System.out.println("Array: " );
        for(String elements : arrayListOfElements) {
            System.out.println(elements);
        }
    }
}
