package io.github.theacid.challenge154;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        HashMap<Integer, String> listOfElements = new HashMap<>();
        listOfElements.put(1, "Java");
        listOfElements.put(2, "Scala");
        listOfElements.put(3, "Golang");
        listOfElements.put(4, "C#");
        listOfElements.put(5, "C");
        listOfElements.put(6, "C++");
        listOfElements.put(7, "Elixir");

        System.out.println("Original HashMap: " + listOfElements);

        HashMap newMap;
        newMap = (HashMap)listOfElements.clone();

        System.out.println("Clone: " + newMap);
    }
}
