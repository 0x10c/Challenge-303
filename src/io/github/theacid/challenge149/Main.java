package io.github.theacid.challenge149;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> listOfElements = new TreeSet<>();
        TreeSet<Integer> treeheadset;

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

        treeheadset = (TreeSet<Integer>)listOfElements.headSet(5);
        Iterator iterator;
        iterator = treeheadset.iterator();

        System.out.println("TreeSet: ");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
