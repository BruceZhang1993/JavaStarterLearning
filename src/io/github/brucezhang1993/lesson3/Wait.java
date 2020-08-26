package io.github.brucezhang1993.lesson3;

public class Wait {
    private static void wait(int seconds) throws InterruptedException {
        long start = System.currentTimeMillis();
        while (true) {
            if (System.currentTimeMillis() - start >= seconds * 1000) {
                break;
            }
            Thread.sleep(1);
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            wait(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("开始: %d 结束：%d 时间：%dms", start, end, end - start);
    }
}
