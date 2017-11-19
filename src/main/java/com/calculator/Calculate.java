package com.calculator;

public class Calculate {

    public static void main(String[] args) {
        double a = 1.5;
        double b = 2.9;

        Calculator calculator = new Calculator();
        double resultOfAdd = calculator.add(a,b);
        double resultOfSubtract = calculator.subtract(a,b);
        double resultOfMultiply = calculator.multiply(a,b);
        double resultOfDivide = calculator.divide(a,b);

        System.out.println("Dodawanie: " + resultOfAdd);
        System.out.println("Odejmowanie: " + resultOfSubtract);
        System.out.println("Mnożenie: " + resultOfMultiply);
        System.out.println("Dzielenie: " + resultOfDivide);

    }



}
