package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scan = new Scanner(System.in);

        // Create an instance of Calculator
        Calculator calc = new Calculator();

        while(true) {
            // Prompt user to select an operation
            System.out.println(" ");
            System.out.println("=========Select an Operation=======");
            System.out.println("[0]Exit");
            System.out.println("[1]Add");
            System.out.println("[2]Subtract");
            System.out.println("[3]Multiply");
            System.out.println("[4]Divide");
            System.out.print("Enter choice: ");

            // Read the selected operation from the user
            String operation = scan.next();

            // Check for invalid operations
            if(!operation.equals("0") && !operation.equals("1") && !operation.equals("2") && !operation.equals("3") && !operation.equals("4")) {
                System.out.println("Invalid operation. Try again.");
                continue;
            }

            // Check if user wants to exit
            if(operation.equals("0")) {
                break;
            }

            try {
                // Prompt user to enter first number
                System.out.print("Enter first number: ");
                double num1 = scan.nextDouble();

                // Prompt user to enter second number
                System.out.print("Enter second number: ");
                double num2 = scan.nextDouble();

                // Initialize result variable
                double result = 0;

                // Perform operation based on user input
                switch(operation) {
                    case "1":
                        result = calc.add(num1, num2);
                        break;
                    case "2":
                        result = calc.subtract(num1, num2);
                        break;
                    case "3":
                        result = calc.multiply(num1, num2);
                        break;
                    case "4":
                        result = calc.divide(num1, num2);
                        break;
                }
                // Display result
                System.out.println("Result: " + result);
            } catch (ArithmeticException ex) {
                // Handle division by zero
                System.out.println("Error: " + ex.getMessage());
            } catch (Exception ex) {
                // Handle invalid input and clear it from the scanner
                System.out.println("Invalid input. Enter valid numbers.");
                scan.next();
            }
        }
         // Close the scanner
        scan.close();
    }
}