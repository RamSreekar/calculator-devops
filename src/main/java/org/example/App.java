package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        int choice;
        double operand, result, exponent = 1;

        Calculator calci = new Calculator();

        calci.showMenu();

        choice = calci.getScanner().nextInt();
        calci.getScanner().nextLine();

        if(choice == 4) {
            System.out.println("Enter the base : ");
            operand = calci.getScanner().nextDouble();
            calci.getScanner().nextLine();
            System.out.println("Enter the exponent : ");
            exponent = calci.getScanner().nextDouble();
            calci.getScanner().nextLine();
        }
        else {
            System.out.println("Enter the operand : ");
            operand = calci.getScanner().nextDouble();
            calci.getScanner().nextLine();
        }

        result = calci.performOperation(choice, operand, exponent);

        System.out.println("Result : "+result);
    }
}
