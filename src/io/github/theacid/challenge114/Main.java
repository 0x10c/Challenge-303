package io.github.theacid.challenge114;

import java.util.LinkedList;

class LinkedListAddElement {
    public static void main(String[] args) {
        LinkedList<String> listOfElements = new LinkedList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("Elements from LinkedList: " + listOfElements);
    }
}
