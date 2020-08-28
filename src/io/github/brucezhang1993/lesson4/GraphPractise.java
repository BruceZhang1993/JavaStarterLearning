package io.github.brucezhang1993.lesson4;

abstract class Graph {
    abstract double perimeter();
}

class Triagle extends Graph {
    private final double a;
    private final double b;
    private final double c;

    Triagle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}

class Round extends Graph {
    private final double radius;

    Round(double radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2.0 * Math.PI * radius;
    }
}

public class GraphPractise {
    public static void main(String[] args) {
        System.out.println(new Triagle(3.0, 4.0, 5.0).perimeter());
        System.out.println(new Round(5.0).perimeter());
    }
}
