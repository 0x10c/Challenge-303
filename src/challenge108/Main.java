package challenge108;

import java.util.ArrayList;
import java.util.List;

class CompareArrayList {
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

        System.out.println(listOfElements);
        listOfElements2.retainAll(listOfElements);
        System.out.println(listOfElements2);
    }
}