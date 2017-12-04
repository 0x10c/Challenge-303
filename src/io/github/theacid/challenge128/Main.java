package io.github.theacid.challenge128;

import java.util.LinkedList;

class CheckIfEmpty {
    public static void main(String[] args) {
        LinkedList<String> listOfElements = new LinkedList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        //listOfElements.removeAll(listOfElements);

        if(listOfElements.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            System.out.println(listOfElements);
        }
    }
}
