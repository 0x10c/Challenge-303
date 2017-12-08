package io.github.theacid.challenge147;

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

        System.out.println("Original: " + listOfElements);

        TreeSet<String> clone = (TreeSet<String>)listOfElements.clone();
        System.out.println("Clone: " + clone);
    }
}
