package com.calculator;

public class Calculator {

    public static final String ADD = "+";
    public static final String MINUS = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";

    public double calculate(String operator, double a, double b) {
        double result = 0;

        switch (operator) {
            case ADD:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                result = a / b;
                break;
            default:
                System.out.println("Brak podanego operatora");
        }
        return result;
    }
}


