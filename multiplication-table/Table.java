import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("Multiplication Table Generator");

        while (true) {
            System.out.print("Enter any number: ");
            int num = sc.nextInt();
            System.out.print("Enter range for your table: ");
            int range = sc.nextInt();

            if (num == 0) {
                System.out.println("Anything multiplied to 0 is equal to 0!");
            } else if (num < 0) {
                System.out.println("Input positive numbers only...");
                break;
            } else {
                System.out.println("Multiplication table for " + num);
                System.out.println("---------------------------");

                printTable(num, range);
                System.out.println("---------------------------");
            }

            System.out.print("Do you want to continue [Yes(y)/No(n)]: ");
            String option = sc.next();

            if (option.equalsIgnoreCase("No")|| option.equalsIgnoreCase("n")) {
                break;
            }
        }

        sc.close();
    }

    public static void printTable(int num, int range) {
        for (int i = 1; i <= range; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
