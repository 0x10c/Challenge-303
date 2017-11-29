package challenge103;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOfElements = new ArrayList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        if(listOfElements.contains("Elixir")) {
            System.out.println("Elixir is on the ");
        }
        else {
            System.out.println("Element Elixir doesn't exist on the list.");
        }
    }
}
