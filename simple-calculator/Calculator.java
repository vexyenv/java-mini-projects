import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("Calculator");

        for (int i = 1;; i++) {
            System.out.println("Calculation #" + i);
            System.out.print("Enter a number: ");
            double numA = sc.nextDouble();
            System.out.print("Enter another number: ");
            double numB = sc.nextDouble();
            System.out.println("[Add, Subtract, Divide, Multiply, Remainder]");
            System.out.print("Choose operator [+,-,/,*,%]: ");
            String operator = sc.next();

            if (operator.equals("+") || operator.equalsIgnoreCase("add")) {
                System.out.println("Sum = " + (numA + numB));
            } else if (operator.equals("-") || operator.equalsIgnoreCase("subtract")) {
                System.out.println("Difference = " + (numA - numB));
            } else if (operator.equals("/") || operator.equalsIgnoreCase("divide")) {
                if (numB == 0) {
                    System.out.println("Cannot divide by 0.");
                } else {
                    System.out.println("Quotient = " + (numA / numB));
                }
            } else if (operator.equals("*") || operator.equalsIgnoreCase("multiply")) {
                System.out.println("Product = " + (numA * numB));
            } else if (operator.equals("%") || operator.equalsIgnoreCase("remainder")) {
                System.out.println("Remainder = " + (numA % numB));
            } else {
                System.out.println("Invalid operator!");
            }

            System.out.println("------------------");

            System.out.print("Do you want to continue? [yes (y)/no (n)]: ");
            String option = sc.next();
            if (option.equalsIgnoreCase("no") || option.equalsIgnoreCase("n")) {
                System.out.println("Calculator has been closed.");
                break;
            }
        }
    }
}