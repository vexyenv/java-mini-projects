import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Interest Calculator");

        for (int j = 1;; j++) {
            System.out.print("Enter principal amount: ");
            double principal = sc.nextDouble();
            System.out.print("Enter rate of interest: ");
            double rate = sc.nextDouble();
            System.out.print("Enter time in years: ");
            double time = sc.nextDouble();

            System.out.print("Choose type of interest (Simple[SI]/Compound[CI]): ");
            String type = sc.next();

            if (type.equalsIgnoreCase("SI")) {
                double SI = (principal * rate * time) / 100;
                System.out.println("Interest: " + SI);
                System.out.println("Final amount: " + (principal + SI));
            } else if (type.equalsIgnoreCase("CI")) {
                double amount = principal;
                double rateFraction = rate / 100;

                for (int i = 1; i <= time; i++) {
                    amount = amount * (1 + rateFraction);
                }

                double CI = amount - principal;
                System.out.println("Interest: " + CI);
                System.out.println("Final amount: " + amount);
            } else {
                System.out.println("Invalid Input!");
            }

            System.out.println("-----------------------------------");

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
