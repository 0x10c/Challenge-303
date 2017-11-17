package challenge042;

import java.time.LocalDate;

class DaysFrom {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        System.out.println("Today is: " + currentDate);

        System.out.println("In 15 days it will be: " + currentDate.plusDays(15));
        System.out.println("15 days ago from today was: " + currentDate.plusDays(-15));

    }
}