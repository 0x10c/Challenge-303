package io.github.theacid.challenge124;

import java.util.LinkedList;

class RetrieveElement {
    public static void main(String[] args) {
        LinkedList<String> listOfElements = new LinkedList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("Original: " + listOfElements);
        String peekFirst = listOfElements.peekFirst();
        String peekLast = listOfElements.peekLast();

        System.out.println("First: " + peekFirst + "\nLast: " + peekLast);
    }
}
