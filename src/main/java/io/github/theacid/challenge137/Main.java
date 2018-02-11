package io.github.theacid.challenge137;

import java.util.LinkedHashSet;
// poprawic
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> listOfElements = new LinkedHashSet<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        LinkedHashSet<String> listOfElements2 = new LinkedHashSet<String>();
        listOfElements2.add("ASP.NET");
        listOfElements2.add("JEE");
        listOfElements2.add("Golang");
        listOfElements2.add("Spring");
        listOfElements2.add("C");
        listOfElements2.add("C++");
        listOfElements2.add("Elixir");

        for(String elements : listOfElements) {
            //System.out.println(listOfElements2.contains(elements) ? "Yes" : "No");
            if(listOfElements2.contains(elements)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
