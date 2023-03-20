package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {
        int choice;
        double operand, result, exponent = 1;

        Calculator calci = new Calculator();

        calci.showMenu();

        choice = calci.getScanner().nextInt();
        calci.getScanner().nextLine();

        switch(choice) {
            case 1: logger.info("Square Root :\n"); break;
            case 2: logger.info("Factorial :\n"); break;
            case 3: logger.info("Natural Logarithm :\n"); break;
            case 4: logger.info("Power :\n"); break;
            default: logger.info("Invalid Choic!e\n"); break;
        }

        if(choice == 4) {
            System.out.println("Enter the base : ");
            operand = calci.getScanner().nextDouble();
            calci.getScanner().nextLine();
            System.out.println("Enter the exponent : ");
            exponent = calci.getScanner().nextDouble();
            calci.getScanner().nextLine();

            logger.info("Input : Base = "+operand+" Exponent = "+exponent);
        }
        else {
            System.out.println("Enter the operand : ");
            operand = calci.getScanner().nextDouble();
            calci.getScanner().nextLine();

            logger.info("Input : "+operand);
        }

        if(operand < 0) {
            System.out.println("Invalid input!\nInput should be non-negative");
        }

        result = calci.performOperation(choice, operand, exponent);

        System.out.println("Result : "+result);
        logger.info("Result : "+result);
    }
}
