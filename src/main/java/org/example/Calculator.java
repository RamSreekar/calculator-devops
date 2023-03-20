package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    private Scanner inputScanner;

    public Scanner getScanner() {
        return this.inputScanner;
    }

    public void setScanner() {
        this.inputScanner = new Scanner(System.in);
    }

    public Calculator() {
        this.setScanner();
    }

    public double squareRoot(double operand) {
        try {
            return Math.sqrt(operand);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Error: Input should only be of type Double");
        }
    }

    public double factorial(double operand) throws InputMismatchException {
        long longOperand = (long) operand;
        long result = 1;
        for(long i=2; i<=longOperand; i++) {
            result *= i;
        }

        return result;
    }

    public double naturalLogarithm(double operand) throws InputMismatchException {
        return Math.log(operand);
    }

    public double power(double base, double exponent) throws InputMismatchException {
        return Math.pow(base, exponent);
    }

    public double performOperation(int choice, double operand, double exponent) {

        switch(choice) {
            case 1: return this.squareRoot(operand);
            case 2: return this.factorial(operand);
            case 3: return this.naturalLogarithm(operand);
            case 4: return this.power(operand, exponent);
            default: System.out.println("Invalid Choice!"); return -1;
        }
    }

    public void showMenu() {
        System.out.println("--------- List of operations ---------\n");
        System.out.println("1. Square Root\n2. Factorial\n3. Natural Logarithm\n4. Power\n");
        System.out.println("Enter your choice : ");
    }

}