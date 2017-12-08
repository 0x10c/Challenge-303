package io.github.theacid.challenge145;

import java.util.Iterator;
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

        System.out.println("Normal: " + listOfElements);
        Iterator iterator = listOfElements.descendingIterator();
        System.out.println("Reversed elements: ");
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
