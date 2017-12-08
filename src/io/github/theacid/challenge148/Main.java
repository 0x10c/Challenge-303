package io.github.theacid.challenge148;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> listOfElements = new TreeSet<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println(listOfElements);

        TreeSet<String> listOfElements2 = new TreeSet<>();
        listOfElements2.add("ASP.NET");
        listOfElements2.add("JEE");
        listOfElements2.add("Spring");
        listOfElements2.add("Iris MVC");
        listOfElements2.add("Spring Boot");
        listOfElements2.add("C#");
        listOfElements2.add("Golang");

        System.out.println(listOfElements2);
        System.out.println();

        for(String elements : listOfElements) {
            if(listOfElements2.contains(elements)) {
                System.out.print("Yes, ");
            }
            else {
                System.out.print("No, ");
            }
        }
    }
}
