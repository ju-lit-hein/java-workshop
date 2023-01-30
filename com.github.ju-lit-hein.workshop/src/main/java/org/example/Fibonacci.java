package org.example;

public class Fibonacci {
    public static void main(String []args) {
        int n = 0;
        if (args.length == 0) {
            n = 10;
        } else {
            n = Integer.parseInt(args[0]);
        }
        System.out.printf("Suite de Fibonacci de %d:\n", n);
        System.out.printf("Recursive: %d\n", recursiveFibonacci(n));
        System.out.printf("Iterative: %d\n", iterativeFibonacci(n));
    }

    public static int recursiveFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }
    public static int iterativeFibonacci(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
