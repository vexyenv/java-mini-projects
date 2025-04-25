import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------");
            System.out.println("Interest Calculator");

            System.out.print("Enter principal amount: ");
            double principal = sc.nextDouble();
            System.out.print("Enter rate (in %): ");
            double rate = sc.nextDouble();
            System.out.print("Enter time (in years): ");
            double time = sc.nextDouble();

            System.out.print("Choose SI/CI: ");
            String option = sc.next();

            if (option.equalsIgnoreCase("SI")) {
                simpleInterest(principal, rate, time);
            } else if (option.equalsIgnoreCase("CI")) {
                compoundInterest(principal, rate, time);
            }

            System.out.println("---------------------");

            System.out.print("Do you want to exit (Yes[y]/No[n]): ");
            String quit = sc.next();

            if (quit.equalsIgnoreCase("Yes") || quit.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    public static void simpleInterest(double principal, double rate, double time) {
        double SI = (principal * rate * time) / 100;
        System.out.println("Interest: " + SI);
        System.out.println("Final amount: " + (principal + SI));
    }

    public static void compoundInterest(double principal, double rate, double time) {
        double r = rate / 100;
        double amount = principal;

        for (int i = 1; i <= time; i++) {
            amount = amount * (1 + r);
        }

        double compoundInterest = amount - principal;

        System.out.println("Compound Interest: "+ compoundInterest);
        System.out.println("Total Amount: "+ amount);
    }
}
