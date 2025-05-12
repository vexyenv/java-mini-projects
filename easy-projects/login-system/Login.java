import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Login details
        String user = "admin@root";
        String pass = "admin-!16@9124";

        boolean success = true;

        System.out.println("---------------------");
        System.out.println("[Simple Login System]");
        System.out.println("Enter details below ->");

        int tries = 3;

        for (int i = 1; i <= tries; i++ ) {
            System.out.print("Enter username: ");
            String username = sc.next();
            System.out.print("Enter password: ");
            String password = sc.next();

            if (username.equalsIgnoreCase(user) && password.equals(pass)) {
                System.out.println("Login Successful");
                System.out.println("Welcome back " + user + "!");
                success = true;
                break;
            } else if (username.equalsIgnoreCase(user) && !password.equals(pass)) {
                System.out.println("Correct username, but wrong password...");
            } else {
                System.out.println("Invalid Credentials");
                System.out.println("Forgot password, contact an admin");
            }

            System.out.println("---------------------");
        }

        if (!success) {
            System.out.println("You failed 3 times!");
            System.out.println("Account locked");
        }

        sc.close();
    }
}
