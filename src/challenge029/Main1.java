package challenge029;

import java.util.Scanner;

class NumberOfTheDayName1 {
    public static void main(String[] args) {
        int dayNumber;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Day number: ");
        dayNumber = inputValue.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Sorry! God created only 7 days.");
        }
    }
}
