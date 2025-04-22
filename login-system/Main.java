import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Login details
        String user = "admin@root";
        String pass = "admin-!16@9124";

        System.out.println("---------------------");
        System.out.println("[Simple Login System]");
        System.out.println("Enter details below ->");

        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();

        if (username.equals(user) && password.equals(pass)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }

        System.out.println("---------------------");

        sc.close();
    }
}
