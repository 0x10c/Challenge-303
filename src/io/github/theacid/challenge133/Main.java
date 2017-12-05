package io.github.theacid.challenge133;

import java.util.HashSet;

public class Main {
    private static HashSet<String> languageList() {
        HashSet<String> listOfElements = new HashSet<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        return listOfElements;
    }

    public static void main(String[] args) {
        HashSet listOfElements = languageList();

        if(listOfElements.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Language list has " + listOfElements.size() + " languages:" + "\n" + listOfElements);
        }
    }
}
