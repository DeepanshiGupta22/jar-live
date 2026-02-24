package com.demo;


public final class App {


    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot perform modulus by zero");
        }
        return a % b;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(number);
    }
}