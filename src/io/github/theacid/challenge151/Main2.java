package io.github.theacid.challenge151;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        HashMap<Integer, String> listOfElements = new HashMap<>();
        listOfElements.put(1, "Java");
        listOfElements.put(2, "Scala");
        listOfElements.put(3, "Golang");
        listOfElements.put(4, "C#");
        listOfElements.put(5, "C");
        listOfElements.put(6, "C++");
        listOfElements.put(7, "Elixir");

        Iterator iterator = listOfElements.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry elements = (Map.Entry)iterator.next();
            System.out.println(elements.getKey() + " " + elements.getValue());
            iterator.remove();
        }
    }
}
