package challenge031;

import java.time.Year;

class LeapYear2 {
    public static void main(String[] args){
        Year year = Year.now();
        boolean isYearLeap = year.isLeap();

        System.out.println(isYearLeap);
    }
}
