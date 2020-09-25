package io.github.brucezhang1993.lesson5;

class Above10Exception extends RuntimeException {
    public Above10Exception(String message) {
        super(message);
    }
}

public class ExceciseOne {
    private static int divide(int num1, int num2)
    {
        if (num1 > 10) {
            throw new Above10Exception("above 10");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(11, 1));
            System.out.println(divide(1, 0));
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getMessage());
        } catch (Above10Exception above10Exception) {
            System.out.println(above10Exception.getMessage());
        }
    }
}
