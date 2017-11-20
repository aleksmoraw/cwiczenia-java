package com.calculator;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        double a = scanner.nextDouble();
        System.out.println("Jakie działanie chcesz wykonać ? ( +, -, *, /)");
        scanner.nextLine();
        String operator = scanner.nextLine();
        System.out.println("Podaj drugą liczbę:");
        double b = scanner.nextDouble();

        Calculator calculator = new Calculator();
        double result = calculator.calculate(operator, a, b);
        System.out.println("Wynik: " + result);

        scanner.close();
    }
}
