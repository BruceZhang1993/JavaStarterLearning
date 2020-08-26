package io.github.brucezhang1993.lesson3;

import java.util.Random;

public class MyRandom {
    private static int target;

    private static void guess() {
        int counter = 1;
        int current = 0;
        int left = 0;
        int right = 1000;
        while ((current = (int) ((left + right) / 2)) != target) {
            if (current > target) {
                right = current;
            } else {
                left = current;
            }
            counter++;
        }
        System.out.printf("随机数字是 %d 一共猜了 %d 次", current, counter);
    }

    public static void main(String[] args) {
        Random random = new Random();
        target = random.nextInt(1000);
        MyRandom.guess();
    }
}
