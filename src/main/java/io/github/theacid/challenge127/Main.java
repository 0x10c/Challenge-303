package io.github.theacid.challenge127;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOfElements = new LinkedList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        LinkedList<String> listOfElements2 = new LinkedList<>();
        listOfElements2.add("ASP.NET");
        listOfElements2.add("JEE");
        listOfElements2.add("Golang");
        listOfElements2.add("Spring");
        listOfElements2.add("C");
        listOfElements2.add("C++");
        listOfElements2.add("Elixir");

        // System.out.println(listOfElements.containsAll(listOfElements2));
        for(String elements : listOfElements) {
            if(listOfElements2.contains(elements)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
