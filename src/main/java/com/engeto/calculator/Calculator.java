package com.engeto.calculator;

public class Calculator {

    public long add(int a, int b) {
        return a + b;
    }

    public long multiply(int a, int b) {
        return (long) a * b;
    }

    public long subtract(int a, int b) {
        return a - b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nulou nelze dělit!");
        } return (double) a / b;

    }

    public double squareRoot(int a) {
        if (a <= 0) {
            throw new ArithmeticException("Nelze použít záporné číslo!");
        }
        return Math.sqrt(a);
    }

    public double square(int a) {
        return a * a;
    }

    public double areaOfCircle(int a) {
        if (a <= 0) {
            throw new ArithmeticException("Nelze použít záporné číslo!");
        }
        return (a * a)*Math.PI;
    }
}