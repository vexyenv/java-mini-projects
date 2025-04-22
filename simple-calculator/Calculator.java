import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("Calculator");

        System.out.print("Enter a number: ");
        double numA = sc.nextDouble();
        System.out.print("Enter another number: ");
        double numB = sc.nextDouble();
        System.out.print("Choose operator [+,-,/,*]");
        String operator = sc.next();

        if (operator.equals("+")) {
            System.out.println("Sum = " + (numA + numB));
        } else if (operator.equals("-")) {
            System.out.println("Difference = " + (numA - numB));
        } else if (operator.equals("/")) {
            System.out.println("Quotient = " + (numA / numB));
        } else if (operator.equals("*")) {
            System.out.println("Product = " + (numA * numB));
        } else {
            System.out.println("Invalid operator!");
        }

        System.out.println("------------------");

        sc.close();
    }
}