package com.algorithms.recursion;

public class GCDRecursion {

    public static void main(String[] args) {
        GCDRecursion gcdRecursion = new GCDRecursion();
        var result = gcdRecursion.gcd(48,18);
        System.out.println(result);
    }

    public int gcd(int a, int b) {

        // Step3: Unintentional case- the constraint
        if (a < 0 || b < 0) {
            return -1;
        }

        // Step2: base case- stopping criterion
        if (b == 0) {
            return a;
        }

        // Step1: recursive case
        return gcd(b, a%b);
    }
}
