import java.util.Calendar;

public class problem19 {
    public static void main(String[] args) {
        /*
        1 Jan 1900 was a Monday.
        Thirty days has September,
        April, June and November.
        All the rest have thirty-one,
        Saving February alone,
        Which has twenty-eight, rain or shine.
        And on leap years, twenty-nine.
        A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
        How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
        */

        Calendar cal = Calendar.getInstance();
        // cal.set(1900,0,1);
        // Date date = cal.getTime();
        // SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
        // System.out.println(date);

        int result = 0;

        for (int i = 0; i <= 99; i++) {
            for (int j = 0; j <= 11; j++) {
                cal.set(1901+i, j, 1);
                if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
                        result ++;
                }
            }
        }

        System.out.println(result);
    }
}
