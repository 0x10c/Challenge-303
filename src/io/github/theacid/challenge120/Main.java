package io.github.theacid.challenge120;

import java.util.LinkedList;

class RemoveElement {
    public static void main(String[] args) {
        LinkedList<String> listOfElements = new LinkedList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        listOfElements.removeFirst();
        listOfElements.removeLast();
        listOfElements.remove(3);

        for(int i = 0; i < listOfElements.size(); i++) {
            System.out.println(i + ". " + listOfElements.get(i));
        }
    }
}
