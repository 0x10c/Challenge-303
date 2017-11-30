package challenge108;

import java.util.ArrayList;
import java.util.List;

class CompareArrayList2 {
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

        List<Integer> comparing = new ArrayList<Integer>();
        for(int i = 0; i < listOfElements.size(); i++) {
            comparing.add(0);
        }

        for(int counter = 0; counter < listOfElements.size(); counter++) {
            if(listOfElements2.contains(listOfElements.get(counter))) {
                comparing.set(counter, 1);
            }
        }

        // 0 if element doesn't exist
        // 1 if element exist
        System.out.println(comparing);
    }
}