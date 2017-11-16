package challenge038;

import java.util.Calendar;

class CurrentDatetime {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.print("Year: " + calendar.get(Calendar.YEAR) +
                "\nMonth: " + calendar.get(Calendar.MONTH) +
                "\nDay of month: " + calendar.get(Calendar.DAY_OF_MONTH) +
                "\nDay of week: " + calendar.get(Calendar.DAY_OF_WEEK) +
                "\nHour: " + calendar.get(Calendar.HOUR_OF_DAY) +
                "\nMinutes: " + calendar.get(Calendar.MINUTE) +
                "\nSeconds: " + calendar.get(Calendar.SECOND)
        );
    }
}
