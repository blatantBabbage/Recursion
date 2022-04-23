package com.algorithms.recursion;

public class FactorialRecursion {

    public static void main(String[] args) {
        FactorialRecursion recursion = new FactorialRecursion();
        /**
         * The var keyword was introduced in Java 10. Type inference is used in var keyword in
         * which it detects automatically the datatype of a variable based on the surrounding context.
         * var cannot be used in an instance and global variable declaration.
         * var cannot be used as a Generic type.
         * var cannot be used for method parameters and return type.
         */
        var result = recursion.factorial(0);
        System.out.println(result);
    }

    public int factorial(int n) {

        // Step3: Unintentional case- the constraint
        if (n<1 && n != 0) {
            return -1;
        }

        // Step2: base case- stopping criterion
        if (n == 0 || n == 1){
            return 1;
        }

        // Step1: recursive case
        return n*factorial(n-1);
    }
}
