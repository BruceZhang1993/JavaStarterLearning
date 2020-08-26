package io.github.brucezhang1993.lesson3;

import java.util.concurrent.TimeUnit;

public class Wait {
    private static final long BASE = 2000000L;

    private static void waitSeconds(int seconds) throws InterruptedException {
        final long end = System.nanoTime() + seconds * 1000000000L;
        long timeLeft = seconds * 1000000000L;
        while (true) {
            if (timeLeft > BASE) {
                Thread.sleep(1L);
            } else {
                if (timeLeft <= 0) {
                    break;
                }
                Thread.sleep(0L);
            }
            timeLeft = end - System.nanoTime();
        }
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        try {
            waitSeconds(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        System.out.printf("执行时间：%d nanoseconds", end - start);
    }
}
