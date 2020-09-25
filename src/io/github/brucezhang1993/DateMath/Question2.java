package io.github.brucezhang1993.DateMath;

import java.util.Arrays;
import java.util.Random;

public class Question2 {
    private static int[] statistic() {
        int[] counter = new int[10];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int num = random.nextInt(10);
            counter[num]++;
        }
        return counter;
    }

    public static void main(String[] args) {
        // 统计 1000 次并输入结果数组
        System.out.println(Arrays.toString(statistic()));
    }
}
