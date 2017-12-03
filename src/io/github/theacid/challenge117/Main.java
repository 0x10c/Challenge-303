package io.github.theacid.challenge117;

import java.util.LinkedList;

class AddFirstLast {
    public static void main(String[] args) {
        LinkedList<String> listOfElements = new LinkedList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("Before: " + listOfElements);

        listOfElements.addFirst("Cobol");
        listOfElements.add(5, "F#");
        listOfElements.addLast("Julia");

        System.out.println("After: " + listOfElements);
    }
}
