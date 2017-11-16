package challenge039;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

class DateIn {
    public static void main(String[] args) {
        Date timeToday = new Date();

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String newYork = dateFormat.format(timeToday);

        dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
        String moscow = dateFormat.format(timeToday);

        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        String hoChiMinh = dateFormat.format(timeToday);

        System.out.println("Date in New York: " + newYork + "\nDate in Moscow: " + moscow + "\nDate in Ho Chi Minh: " + hoChiMinh);
    }
}
