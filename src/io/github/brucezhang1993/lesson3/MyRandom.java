package io.github.brucezhang1993.lesson3;

import java.util.Random;

public class MyRandom {
    private static int target;
    private static int counter = 0;
    private static Random random = new Random();

    private static int guess(int left, int right) {
        int current = (int) ((left + right) / 2);
        counter++;
        if (current == target) {
            return current;
        }
        if (right - left < 2) {
            return -1;
        }
        boolean chooseRight = random.nextBoolean();
        int a = -1;
        if (chooseRight) {
            a = guess(current + 1, right);
        } else {
            a = guess(left, current);
        }
        if (a == -1) {
            if (chooseRight) {
                return guess(left, current);
            } else {
                return guess(current + 1, right);
            }
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        target = random.nextInt(1000);
        System.out.println(target);
        System.out.println(MyRandom.guess(0, 1000));
        System.out.println(counter);
    }
}
