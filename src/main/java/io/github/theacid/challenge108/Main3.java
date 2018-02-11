package io.github.theacid.challenge108;

import java.util.ArrayList;
import java.util.List;

class Main3 {
    public static void main(String[] args) {
        List<String> listOfElements = new ArrayList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        List<String> listOfElements2 = new ArrayList<>();
        listOfElements2.add("Spring");
        listOfElements2.add("JEE");
        listOfElements2.add("Golang");
        listOfElements2.add("ASP.NET");

        List<String> comparing = new ArrayList<String>();
        for(int i = 0; i < listOfElements.size(); i++) {
            comparing.add("\nItem does not exist");
        }

        for(int counter = 0; counter < listOfElements.size(); counter++) {
            if(listOfElements2.contains(listOfElements.get(counter))) {
                comparing.set(counter, "\nItem exists");
            }
        }

        // "Item does not exist", if element doesn't exist
        // "Item exists", if element exist
        System.out.println(comparing);
    }
}