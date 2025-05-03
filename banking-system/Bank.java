import java.util.Scanner;

public class Bank {

    static String user = "";
    static int tax = 15;
    static int balance = 0;
    static String password = "";
    static boolean isLoggedIn = false;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("[-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-]");
        System.out.println("[Banking System]");
        System.out.println();

        int option;

        do {
            System.out.println("========================");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Show Balance");
            System.out.println("5. Access Account");
            System.out.println("6. Log Out");
            System.out.println("7. Exit");
            System.out.println("========================");
            System.out.println();

            System.out.println("Choose your option [1 - 7]");
            System.out.print("> ");
            option = scn.nextInt();
            scn.nextLine();

            switch (option) {
                case 1:
                    createAccount(scn);
                    break;
                case 2:
                    depositMoney(scn);
                    break;
                case 3:
                    withdrawMoney(scn);
                    break;
                case 4:
                    showBalance(scn);
                    break;
                case 5:
                    accessAccount(scn);
                    break;
                case 6:
                    if (isLoggedIn) {
                        isLoggedIn = false;
                        System.out.println("You have been logged out");
                    } else {
                        System.out.println("You are not logged in");
                    }
                    break;
                case 7:
                    System.out.println("Thanks for using Banking System!");
                    break;
            }
        } while (option != 7);
    }

     static void createAccount(Scanner scn) {
        System.out.print("Enter account holder name: ");
        user = scn.nextLine();
        System.out.print("Enter password: ");
        password = scn.next();
        balance = 0;

        System.out.println("Account created for holder: " + user);
    }

    static void depositMoney(Scanner scn) {
        if (!isLoggedIn) {
            System.out.println("Please Login before!");
            return;
        }

        System.out.print("Enter amount to deposit: ");
        int depositAmount = scn.nextInt();

        int taxedAmount = tax / 100 * depositAmount;
        int finalAmount = depositAmount - taxedAmount;

        if (depositAmount > 0) {
            System.out.println(finalAmount + " amount deposited");
            balance += finalAmount;
            System.out.println("Balance = " + balance);
        } else {
            System.out.println("Enter valid amount to deposit!");
        }
    }

    static void withdrawMoney(Scanner scn) {
        if (!isLoggedIn) {
            System.out.println("Please Login before!");
            return;
        }

        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = scn.nextInt();

        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            System.out.println(withdrawAmount + " withdrawn successfully!");
            balance -= withdrawAmount;
        } else if (withdrawAmount > balance) {
            System.out.println("Your balance is low");
        } else {
            System.out.println("Enter valid amount to withdraw");
        }
    }

    static void showBalance(Scanner scn) {
        if (!isLoggedIn) {
            System.out.println("Please Login before!");
            return;
        }

        System.out.println("Account holder " + user);
        System.out.println("You currently have " + balance);
    }

    static void accessAccount(Scanner scn) {
        System.out.println("Access your account");
        System.out.print("Enter username: ");
        String username = scn.nextLine();
        System.out.print("Enter password: ");
        String pass = scn.nextLine();

        if (username.equalsIgnoreCase(user) && pass.equals(password)) {
            System.out.println("Logged In Successfully!");
            isLoggedIn = true;
        } else {
            System.out.println("Incorrect Input!");
        }
    }
}
