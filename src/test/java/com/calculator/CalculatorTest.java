package com.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class CalculatorTest {

    public static final Double A = 25.0;
    public static final Double B = 5.0;
    Calculator calculator = new Calculator();

    @Test
    public void isAddingIsCorrect () {
        Double result = calculator.add(A,B);
        assertTrue (result.equals(30.0));
    }

    @Test
    public void isSubtractingIsCorrect () {
        Double result = calculator.subtract(A,B);
        assertTrue (result.equals(20.0));
    }

    @Test
    public void isMultiplingIsCorrect () {
        Double result = calculator.multiply(A,B);
        assertTrue (result.equals(125.0));
    }

    @Test
    public void isDividingIsCorrect () {
        Double result = calculator.divide(A,B);
        assertTrue (result.equals(5.0));
    }
}
