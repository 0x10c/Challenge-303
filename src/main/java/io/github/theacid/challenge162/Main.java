package io.github.theacid.challenge162;

import java.io.IOException;
import java.util.*;

public class Main {
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }


    public static void main(String[] args) throws IOException {
        Map<Integer, String> listOfElements = new TreeMap<>();
        listOfElements.put(3, "Java");
        listOfElements.put(0, "Scala");
        listOfElements.put(7, "Golang");
        listOfElements.put(5, "C#");
        listOfElements.put(8, "C");
        listOfElements.put(9, "C++");
        listOfElements.put(10, "Elixir");

        System.out.println("Unsorted: " + listOfElements);

        TreeMap<Integer, String> sorted = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        });

        sorted.putAll(listOfElements);
        System.out.println("Sorted: " + Arrays.toString(sorted.entrySet().toArray()));
        clearConsole();
    }
}
