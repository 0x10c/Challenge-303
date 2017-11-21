package challenge050;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date firstDate = simpleDateFormat.parse("2015-05-05");
        Date secondDate = simpleDateFormat.parse("2014-04-05");

        if(firstDate.compareTo(secondDate) < 0) {
            System.out.println("Date " + firstDate + " was before " + secondDate);
        }
        else if(firstDate.compareTo(secondDate) > 0) {
            System.out.println("Date " + firstDate + " was after " + secondDate);
        }
        else if(firstDate.compareTo(secondDate) == 0) {
            System.out.println("Date " + firstDate + " is equal to " + secondDate);
        }
    }
}
