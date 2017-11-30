package challenge106;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ShuffleArrayList {
    public static void main(String[] args) {
        List<String> listOfElements = new ArrayList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("Before: " + listOfElements);

        Collections.shuffle(listOfElements);

        System.out.println("After: " + listOfElements);
    }
}