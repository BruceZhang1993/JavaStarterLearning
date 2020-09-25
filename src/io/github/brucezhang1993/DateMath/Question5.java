package io.github.brucezhang1993.DateMath;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class DateTimeUtils {
    private static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static long currentTimestamps() {
        return System.currentTimeMillis() / 1000;
    }

    public static String currentTimeString() {
        Calendar calendar = Calendar.getInstance();
        return formatDate(calendar.getTime());
    }

    public static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DEFAULT_FORMAT);
        return dateFormat.format(date);
    }

    public static Date parseDate(String s) throws ParseException {
        return parseDate(DEFAULT_FORMAT, s);
    }

    public static Date parseDate(String format, String s) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.parse(s);
    }
}

public class Question5 {
    public static void main(String[] args) {
        System.out.println(DateTimeUtils.currentTimestamps());
        System.out.println(DateTimeUtils.currentTimeString());
        Calendar calendar = Calendar.getInstance();
        calendar.set(2002, Calendar.JANUARY, 1, 11, 23, 59);
        System.out.println(DateTimeUtils.formatDate(calendar.getTime()));
        try {
            System.out.println(DateTimeUtils.parseDate("2006-01-02 03:04:05"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
