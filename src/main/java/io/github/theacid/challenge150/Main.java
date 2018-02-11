package io.github.theacid.challenge150;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> listOfElements = new TreeSet<>();
        listOfElements.add(1);
        listOfElements.add(2);
        listOfElements.add(3);
        listOfElements.add(4);
        listOfElements.add(5);
        listOfElements.add(6);
        listOfElements.add(7);
        listOfElements.add(8);
        listOfElements.add(9);
        listOfElements.add(10);

        listOfElements.pollFirst();
        listOfElements.pollLast();

        System.out.println(listOfElements);
    }
}
