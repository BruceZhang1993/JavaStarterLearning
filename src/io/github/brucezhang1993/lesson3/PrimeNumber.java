package io.github.brucezhang1993.lesson3;

public class PrimeNumber {
    private static boolean isPrime(int num) {
        if (num <= 3) {
            return true;
        }
        for (int i=2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int counter = 0;
        for (int i=101; i<=200; i++) {
            if (isPrime(i)) {
                counter++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.printf("Total: %d", counter);
    }
}
