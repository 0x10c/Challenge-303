package challenge041;

import java.time.LocalDate;
import java.time.Period;

class DifferenceBetweenDates {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate someDate = LocalDate.of(2016, 5, 20);

        Period period = Period.between(localDate, someDate);
        System.out.println("Difference between " + localDate + " and " + someDate + " is: " + period);
    }
}
