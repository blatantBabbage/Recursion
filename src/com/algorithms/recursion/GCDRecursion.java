package com.algorithms.recursion;

public class GCDRecursion {

    public static void main(String[] args) {
        GCDRecursion gcdRecursion = new GCDRecursion();
        var result = gcdRecursion.gcd(48,18);
        System.out.println(result);
    }

    public int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
