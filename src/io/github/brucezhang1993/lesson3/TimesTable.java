package io.github.brucezhang1993.lesson3;

public class TimesTable {
    private static void printTable() {
        for (int i=1; i<=9; i++) {
            for (int j=1; j<=i; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTable();
    }
}