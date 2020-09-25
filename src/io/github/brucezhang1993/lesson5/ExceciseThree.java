package io.github.brucezhang1993.lesson5;

public class ExceciseThree {
    private static int print(String num) {
        int i = 0;
        try {
            i = Integer.parseInt(num);
            return i;
        } catch (NumberFormatException exception) {
            System.out.println(exception.getMessage());
            return i;
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        System.out.println(print("a12"));
        System.out.println(print("12"));
    }
}
