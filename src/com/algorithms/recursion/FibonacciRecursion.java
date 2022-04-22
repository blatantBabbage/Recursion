package com.algorithms.recursion;

public class FibonacciRecursion {

    public static void main(String[] args) {
        FibonacciRecursion fibonacciRecursion = new FibonacciRecursion();
         var result = fibonacciRecursion.fibonacci(7);
         System.out.println(result);
    }

    public int fibonacci(int n) {

        // Step3: Unintentional case- the constraint
        if (n < 0 && n != 0) {
            return -1;
        }

        // Step2: base case- stopping criterion
        if (n == 0 || n == 1) {
            return n;
        }

        // Step1: recursive case
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
