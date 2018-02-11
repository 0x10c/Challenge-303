package io.github.theacid.challenge119;

import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> listOfElements = new LinkedList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        for(int i = 0; i < listOfElements.size(); i++) {
            System.out.println(i + ". " + listOfElements.get(i));
        }
    }
}
