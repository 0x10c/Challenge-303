package io.github.theacid.challenge040;

import java.time.YearMonth;

class FirstLastDayOfMonth {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2017, 11);

        String firstDayOfMonth = yearMonth.atDay(1).getDayOfWeek().name();
        String lastDayOfMonth = yearMonth.atDay(30).getDayOfWeek().name();

        System.out.print("First day of month: " + firstDayOfMonth + "\nLast day of month: " + lastDayOfMonth);
    }
}