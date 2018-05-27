package io.github.theacid.challenge054;

import java.util.Date;

class Main {
    static void dateObjectDelay() {
        // Creating 3 seconds interval before creating second Date object
        // So both dates will be different
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException exc) {
            System.out.println("Exception: " + exc);
        }
    }

    static void compareDates(Date date1, Date date2) {
        // Compare
        int comparing = date2.compareTo(date1);

        if(comparing > 0) {
            System.out.println(date1 + " is after " + date2);
        }
        else if(comparing < 0) {
            System.out.println(date1 + " is before " + date2);
        }
        else {
            System.out.println("Dates are the same.");
        }
    }

    public static void main(String[] args) {
        Date date1 = new Date();

        dateObjectDelay();

        Date date2 = new Date();

        System.out.println("First date object: " + date1);
        System.out.println("Second date object: " + date2);
        compareDates(date1, date2);
    }
}