package io.github.theacid.challenge149;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> listOfNumbers = new TreeSet<>();
        TreeSet<Integer> newList;

        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(4);
        listOfNumbers.add(5);
        listOfNumbers.add(6);
        listOfNumbers.add(7);
        listOfNumbers.add(8);
        listOfNumbers.add(9);
        listOfNumbers.add(10);

        newList = (TreeSet<Integer>)listOfNumbers.headSet(5);
        Iterator iterator;
        iterator = newList.iterator();

        System.out.println("TreeSet: ");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
