package io.github.brucezhang1993.lesson6;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class QuestionOne {
    private static int stackOverflow(int num) {
        return stackOverflow(num);
    }

    private static void heapOverflow() {
        List<Object> list = new ArrayList<>();
        while(true) {
            list.add(new Object());
        }
    }

    private static void memOverflow()
    {
        while(true) {
            ByteBuffer.allocateDirect(Integer.MAX_VALUE);
        }
    }

    public static void main(String[] args) {
        // 栈溢出
        System.out.println(stackOverflow(1));
        // 堆溢出
        heapOverflow();
        // 本地内存溢出
        memOverflow();
    }
}
