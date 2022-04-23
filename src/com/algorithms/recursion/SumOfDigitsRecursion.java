package com.algorithms.recursion;

public class SumOfDigitsRecursion {

    public static void main(String args[]) {

        SumOfDigitsRecursion sumOfDigitsRecursion = new SumOfDigitsRecursion();
        var result = sumOfDigitsRecursion.sumOfDigit(999);
        System.out.println(result);
    }
    public int sumOfDigit (int n) {

        // Step2: base case- stopping criterion & Unintentional case- the constraint
        if (n == 0 || n < 0) {
            return 0;
        }

        // Step1: recursive case
        return n%10 + sumOfDigit(n/10);
    }
}
