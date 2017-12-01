package io.github.theacid.challenge109;

import java.util.ArrayList;

class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<String> listOfElements2 = new ArrayList<String>();
        listOfElements2.add("Spring");
        listOfElements2.add("JEE");
        listOfElements2.add("Golang");
        listOfElements2.add("ASP.NET");

        System.out.println("Before cloning: " + listOfElements2);

        ArrayList<String> clonedArrayList = (ArrayList<String>)listOfElements2.clone();

        System.out.println("After clonning: " + clonedArrayList);
    }
}
