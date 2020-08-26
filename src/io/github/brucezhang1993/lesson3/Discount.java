package io.github.brucezhang1993.lesson3;

public class Discount {
    private static double calculate(double amount, int level) {
        double discount = 1.0;
        switch (level) {
            case 1:
                if (amount >= 100) {
                    discount = 0.9;
                }
                break;
            case 2:
                if (amount >= 200) {
                    discount = 0.75;
                } else if (amount >= 100) {
                    discount = 0.8;
                }
                break;
            case 3:
                if (amount >= 300) {
                    discount = 0.6;
                } else if (amount >= 200) {
                    discount = 0.65;
                } else if (amount >= 100) {
                    discount = 0.7;
                }
                break;
            default:
                if (amount >= 500) {
                    discount = 0.9;
                }
        }
        return amount * discount;
    }

    public static void main(String[] args) {
        System.out.printf("%.2f%n", Discount.calculate(200, 1));
        System.out.printf("%.2f%n", Discount.calculate(150, 2));
        System.out.printf("%.2f%n", Discount.calculate(100, 3));
        System.out.printf("%.2f%n", Discount.calculate(550, 0));
    }
}
