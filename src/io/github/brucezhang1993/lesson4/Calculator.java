package io.github.brucezhang1993.lesson4;

interface Compute {
    int compute(int n, int m);
}

class ComputeAdd implements Compute {
    @Override
    public int compute(int n, int m) {
        return n + m;
    }
}

class ComputeMinus implements Compute {
    @Override
    public int compute(int n, int m) {
        return n - m;
    }
}

class ComputeMultiple implements Compute {
    @Override
    public int compute(int n, int m) {
        return n * m;
    }
}

class ComputeDivide implements Compute {
    @Override
    public int compute(int n, int m) {
        return n / m;
    }
}

class UseCompute {
    public void useCom(Compute compute, int one, int two) {
        int answer = compute.compute(one, two);
        System.out.println(answer);
    }
}

public class Calculator {
    public static void main(String[] args) {
        UseCompute useCompute = new UseCompute();
        useCompute.useCom(new ComputeAdd(), 6, 2);
        useCompute.useCom(new ComputeMinus(), 6, 2);
        useCompute.useCom(new ComputeMultiple(), 6, 2);
        useCompute.useCom(new ComputeDivide(), 6, 2);
    }
}
