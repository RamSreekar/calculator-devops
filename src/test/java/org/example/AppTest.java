package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest
{
    private static final double delta = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void calculateFactorialTruePositive() {
        assertEquals("Testing factorial", 720, calculator.factorial(6), delta);
        assertEquals("Testing factorial", 120, calculator.factorial(5), delta);
    }

    public void calculateSquareRootTruePositive() {
        assertEquals("Testing factorial", 4, calculator.squareRoot(16), delta);
        assertEquals("Testing factorial", 5, calculator.factorial(25), delta);
    }

    public void calculateNaturalLogarithmTruePositive() {
        assertEquals("Testing factorial", 2.302585092994046, calculator.naturalLogarithm(10), delta);
        assertEquals("Testing factorial", 0.0, calculator.naturalLogarithm(1), delta);
    }

    public void calculatePowerTruePositive() {
        assertEquals("Testing factorial", 25.0, calculator.power(5, 2), delta);
        assertEquals("Testing factorial", 1.0, calculator.power(10, 0), delta);
    }
}

