package io.github.brucezhang1993.DateMath;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Question4 {
    private static boolean isAfternoon(String s) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse(s);
        calendar.setTime(date);
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        return hourOfDay >= 12;
    }

    public static void main(String[] args) {
        try {
            System.out.println(isAfternoon("2006-01-02 03:04:05"));
            System.out.println(isAfternoon("2006-01-02 19:04:05"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
