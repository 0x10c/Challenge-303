package io.github.theacid.challenge177;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> listOfElements = new PriorityQueue<>();
        listOfElements.add("C");
        listOfElements.add("Golang");
        listOfElements.add("Java");
        listOfElements.add("Scala");

        System.out.println("Elements from first queue: " + listOfElements);

        List<String> newList = new ArrayList<>(listOfElements);
        System.out.println("Array list: " + newList);
    }
}
