package challenge034;

import java.util.ArrayList;
import java.util.Arrays;

class ToArrayList {
    public static void main(String[] args) {
        String someNumbers[] = {"One", "Two", "Three", "Four", "Five", "Six"};
        ArrayList<String> someNumbersList = new ArrayList<>(Arrays.asList(someNumbers));

        System.out.println(someNumbersList);
    }
}
