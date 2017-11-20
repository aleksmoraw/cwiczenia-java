package com.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class CalculatorTest {

    public static final Double A = 25.0;
    public static final Double B = 5.0;
    public static final String op1 = "+";
    public static final String op2 = "-";
    public static final String op3 = "*";
    public static final String op4 = "/";
    Calculator calculator = new Calculator();

    @Test
    public void isAddingIsCorrect () {
        Double result = calculator.calculate(op1, A, B);
        assertTrue (result.equals(30.0));
    }

    @Test
    public void isSubtractingIsCorrect () {
        Double result = calculator.calculate(op2, A, B);
        assertTrue (result.equals(20.0));
    }

    @Test
    public void isMultiplingIsCorrect () {
        Double result = calculator.calculate(op3, A, B);
        assertTrue (result.equals(125.0));
    }

    @Test
    public void isDividingIsCorrect () {
        Double result = calculator.calculate(op4, A, B);
        assertTrue (result.equals(5.0));
    }
}
