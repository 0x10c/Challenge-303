package io.github.theacid.challenge115;

import java.util.LinkedList;

class LinkedListIterator {
    public static void main(String[] args) {
        LinkedList<String> listOfElements = new LinkedList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        for(String elements : listOfElements) {
            System.out.println(elements);
        }
    }
}
