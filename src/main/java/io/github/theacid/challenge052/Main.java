package io.github.theacid.challenge052;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Main {
    public static void main(String[] args) {
        String source = "19/05/2018";

        try {
            // SimpleDateFormat with source date format
            SimpleDateFormat dateSource = new SimpleDateFormat("dd/MM/yy");

            // parse string into date object
            Date parsingDate = dateSource.parse(source);

            // SimpleDateFormat object with desired date format
            SimpleDateFormat dateDestination = new SimpleDateFormat("dd-MM-yy - hh:mm:ss");

            // parse into another format
            source = dateDestination.format(parsingDate);

            System.out.println("Date converted from dd-MM-yyyy to dd-MM-yyy - hh:mm:ss");
            System.out.println("Converted date: " + source);

        }
        catch (ParseException exc) {
            System.out.println("Excepiton: " + exc);
        }
    }
}