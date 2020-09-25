package io.github.brucezhang1993.lesson5;

public class ExceciseTwo {
    private static int getInteger(String num) {
        return Integer.parseInt(num);
    }

    public static void main(String[] args) {
        // finally 语句块执行但异常未捕获
        try {
            System.out.println(getInteger("a123"));
        } finally {
            System.out.println("finally");
        }
    }
}
