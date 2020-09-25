package io.github.brucezhang1993.DateMath;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question3 {
    private static Date parse(String date) {
        Pattern pattern = Pattern.compile("(?<year>\\d{4})[-/](?<month>\\d{2})[-/](?<date>\\d{2})( +(?<hour>\\d{2}):(?<minute>\\d{2}):(?<second>\\d{2}))?");
        Matcher matcher = pattern.matcher(date);
        if (matcher.find()) {
            Calendar calendar = Calendar.getInstance();
            int year = Integer.parseInt(matcher.group("year"));
            int month = Integer.parseInt(matcher.group("month")) - 1;
            int day = Integer.parseInt(matcher.group("date"));
            int hour = 0;
            int minute = 0;
            int second = 0;
            if (matcher.group("hour") != null) {
                hour = Integer.parseInt(matcher.group("hour"));
            }
            if (matcher.group("minute") != null) {
                minute = Integer.parseInt(matcher.group("minute"));
            }
            if (matcher.group("second") != null) {
                second = Integer.parseInt(matcher.group("second"));
            }
            calendar.set(year, month, day, hour, minute, second);
            return calendar.getTime();
        } else {
            throw new DateTimeException("解析日期时间错误");
        }
    }

    public static void main(String[] args) {
        Date t1 = parse("2006-01-02 03:04:05");
        Date t2 = parse("2006-01-02");
        Date t3 = parse("2006/01/02 03:04:05");
        Date t4 = parse("2006/01/02");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(t1));
        System.out.println(dateFormat.format(t2));
        System.out.println(dateFormat.format(t3));
        System.out.println(dateFormat.format(t4));
    }
}
