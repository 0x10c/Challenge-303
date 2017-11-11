package challenge031;

import java.util.Scanner;

class LeapYear {

    private static boolean isYearLeap(int year) {
        if(year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))) {
           return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int year;

        System.out.println("Check year: ");

        Scanner inputValues = new Scanner(System.in);
        year = inputValues.nextInt();

        System.out.println(isYearLeap(year));
    }
}
