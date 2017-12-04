package io.github.theacid.challenge123;

import java.util.LinkedList;

class CloneList {
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

        LinkedList<String> clone = (LinkedList)listOfElements.clone();

        System.out.print("Clone: " + clone);
    }
}
