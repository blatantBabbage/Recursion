package com.algorithms.recursion;

public class DecimalToBinary {

    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        var result = decimalToBinary.decimalToBinaryRecursion(10);
        System.out.println(result);
    }

    public int decimalToBinaryRecursion(int n) {

        // Step2: base case- stopping criterion & Unintentional case- the constraint
        if (n == 0){
            return 0;
        }

        // Step1: recursive case
        return 10*decimalToBinaryRecursion(n/2) + n%2;
    }
}
