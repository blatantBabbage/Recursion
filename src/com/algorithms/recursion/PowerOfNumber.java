package com.algorithms.recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        PowerOfNumber powerOfNumber = new PowerOfNumber();
        var result = powerOfNumber.power(2,4);
        System.out.println(result);
    }

    public int power(int base, int exp) {
        // Step3: Unintentional case- the constraint
        if (exp < 0) {
            return -1;
        }

        // Step2: base case- stopping criterion
        if (exp == 0) {
            return 1;
        }
        // Step1: recursive case
        return base*power(base, exp -1);
    }
}
