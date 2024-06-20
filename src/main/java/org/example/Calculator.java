package org.example;

public class Calculator {

    public Calculator() {
        System.out.println("===============WELCOME=============");
    }

    // Method for addition
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Methods for Multiplication
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method for Division
    public double divide(double num1, double num2) throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}