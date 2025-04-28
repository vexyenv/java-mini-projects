import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("Calculator");

        String[] operation = {"+", "-", "/", "*", "%"};

        while (true) {
            System.out.print("Enter a number: ");
            double numA = sc.nextDouble();
            System.out.print("Enter another number: ");
            double numB = sc.nextDouble();
            System.out.println("[Add, Subtract, Divide, Multiply, Remainder]");
            System.out.print("Choose operation " + Arrays.toString(operation) + ":");
            String operator = sc.next();

            switch (operator) {
                case "+":
                    System.out.println("Sum = " + (numA + numB));
                    break;
                case "-":
                    System.out.println("Difference = " + (numA - numB));
                    break;
                case "*":
                    System.out.println("Product = " + (numA * numB));
                    break;
                case "/":
                    if (numA == 0 || numB == 0) {
                        System.out.println("Cannot divide by 0");
                    } else {
                        System.out.println("The quotient = " + (numA / numB));
                    }
                    break;
                case "%":
                    System.out.println("Remainder = " + (numA % numB));
                    break;
                case "add":
                    System.out.println("Sum = " + (numA + numB));
                    break;
                case "subtract":
                    System.out.println("Difference = " + (numA - numB));
                    break;
                case "multiply":
                    System.out.println("Product = " + (numA * numB));
                    break;
                case "divide":
                    if (numA == 0 || numB == 0) {
                        System.out.println("Cannot divide by 0");
                    } else {
                        System.out.println("The quotient = " + (numA / numB));
                    }
                    break;
                case "remainder":
                    System.out.println("Remainder = " + (numA % numB));
                    break;
                default:
                    System.out.println("Invalid Operator!");
                    break;
            }

            System.out.println("------------------");

            System.out.print("Do you want to continue? [yes (y)/no (n)]: ");
            String option = sc.next();
            if (option.equalsIgnoreCase("no") || option.equalsIgnoreCase("n")) {
                System.out.println("Calculator has been closed.");
                break;
            }
        }

        sc.close();
    }
}