import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-]");
        System.out.println("🎯 Welcome to the Number Guessing Game!");

        while (true) {
            int targetNum = (int) ((Math.random() * 100) + 1);
            int guess = 0;
            int tries = 0;

            System.out.println("I'm thinking of a number between 1 and 100...");

            while (guess != targetNum && tries < 10) {
                tries++;
                System.out.println("Try #" + tries);
                System.out.print("Guess the number (1 - 100): ");
                guess = sc.nextInt();

                if (guess > targetNum) {
                    System.out.println("Too high, try again.");
                } else if (guess < targetNum) {
                    System.out.println("Too low, try again.");
                } else {
                    System.out.println("🎉 Congrats! You guessed it right!");
                }
            }

            if (guess != targetNum) {
                System.out.println("You used up all your tries, the number was " + targetNum);
            }

            System.out.print("Do you want to play again? [Yes(y)/No(n)]: ");
            String option = sc.next();

            if (option.equalsIgnoreCase("no") || option.equalsIgnoreCase("n")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }
        }

        System.out.println("[-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-]");

        sc.close();
    }
}
