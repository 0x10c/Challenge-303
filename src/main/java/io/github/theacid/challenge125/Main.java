package io.github.theacid.challenge125;

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

        if(listOfElements.contains("Scala")) {
            System.out.println("Scala is here!");
        }
        else {
            System.out.println("Nope. Sorry...");
        }
    }
}
