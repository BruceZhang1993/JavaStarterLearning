package io.github.brucezhang1993.DateMath;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Question1 {
    public static void main(String[] args) {
        // 生日
        Calendar birth = Calendar.getInstance();
        birth.set(1993, Calendar.NOVEMBER, 1, 0, 0, 0);

        // 当前日期
        Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR, 0);
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);

        // 上次生日&下次生日（当天是生日计算为上次）
        Calendar lastBirthday = (Calendar) birth.clone();
        Calendar nextBirthday = (Calendar) birth.clone();
        if (now.get(Calendar.MONTH) > birth.get(Calendar.MONTH) ||
                (now.get(Calendar.MONTH) == birth.get(Calendar.MONTH) && now.get(Calendar.DATE) >= birth.get(Calendar.DATE))) {
            lastBirthday.set(Calendar.YEAR, now.get(Calendar.YEAR));
            nextBirthday.set(Calendar.YEAR, now.get(Calendar.YEAR) + 1);
        } else {
            lastBirthday.set(Calendar.YEAR, now.get(Calendar.YEAR) - 1);
            nextBirthday.set(Calendar.YEAR, now.get(Calendar.YEAR));
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // 上次生日过了多少天
        long passedDays = (now.getTimeInMillis() - lastBirthday.getTimeInMillis()) / (1000 * 3600 * 24);
        String lastDate = dateFormat.format(lastBirthday.getTime());
        System.out.printf("距上次生日 %s 已经过去 %d 天%n", lastDate, passedDays);

        // 下次生日天数
        long nextDays = (nextBirthday.getTimeInMillis() - now.getTimeInMillis()) / (1000 * 3600 * 24);
        String nextDate = dateFormat.format(nextBirthday.getTime());
        System.out.printf("距下次生日 %s 还有 %d 天%n", nextDate, nextDays);
    }
}
