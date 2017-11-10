package challenge029;

import java.util.Scanner;

public class Main2 {

    private static String getDayName(int dayNumber) {
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Sorry! God created only 7 days.";
        }
        return dayName;
    }

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Enter day number: ");
        int dayNumber = inputValue.nextInt();

        System.out.println(getDayName(dayNumber));
    }
}
