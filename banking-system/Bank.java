import java.util.Scanner;

public class Bank {

    static String user = "";
    static int balance = 0;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("[-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-]");
        System.out.println("[Banking System]");
        System.out.println();

        int option;

        do {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Show Balance");
            System.out.println("5. Exit");
            System.out.println();

            System.out.println("Choose your option [1 - 5]");
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
                    System.out.println("Thank you for using banking system");
                    break;
            }
        } while (option != 5);
    }

     static void createAccount(Scanner scn) {
        System.out.print("Enter account holder name: ");
        user = scn.nextLine();
        balance = 0;

        System.out.println("Account created for holder: " + user);
    }

    static void depositMoney(Scanner scn) {
        System.out.print("Enter amount to deposit: ");
        int depositAmount = scn.nextInt();

        if (depositAmount > 0) {
            balance += depositAmount;
        } else {
            System.out.println("Enter valid amount to deposit!");
        }
    }

    static void withdrawMoney(Scanner scn) {
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
        System.out.println("Account holder " + user);
        System.out.println("You currently have " + balance);
    }
}
