package io.github.theacid.challenge053;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Main {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date date = simpleDateFormat.parse("19-05-18");
            System.out.println(date);
        }
        catch(ParseException exc) {
            System.out.println("Exception: " + exc);
        }
    }
}