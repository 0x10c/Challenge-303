package challenge111;

import java.util.ArrayList;
import java.util.List;

class EmptyArrayList {
    public static void main(String[] args) {
        List<String> listOfElements = new ArrayList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("First array: " + listOfElements);

        listOfElements.remove(5);
        System.out.println("First array: " + listOfElements);

        listOfElements.removeAll(listOfElements);
        System.out.println("First array: " + listOfElements);

        if(listOfElements.isEmpty()) {
            System.out.println("Array is empty");
        }
        else {
            System.out.println("Ok! Keep working!");
        }
    }
}
