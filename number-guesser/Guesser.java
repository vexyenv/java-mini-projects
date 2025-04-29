import java.util.Arrays;
import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-]");
        System.out.println("🎯 Welcome to the Number Guessing Game!");

        while (true) {
            String[] difficulty = {"[Easy(1 - 100)", "Medium(1 - 500)", "Hard(1 - 1000)]"};
            System.out.println(Arrays.toString(difficulty));
            System.out.print("Choose game mode: ");
            String mode = sc.next();
            int range = 0;
            int noOfTries = 0;

            if (mode.equalsIgnoreCase("Easy")) {
                range = 100;
                noOfTries = 10;
            } else if (mode.equalsIgnoreCase("Medium")) {
                range = 500;
                noOfTries = 15;
            } else if (mode.equalsIgnoreCase("Hard")) {
                range = 1000;
                noOfTries = 25;
            } else {
                System.out.println("Invalid Choice! Default mode: Medium");
                range = 500;
                noOfTries = 15;
            }

            int targetNum = (int) ((Math.random() * range) + 1);
            int guess = 0;
            int tries = 0;

            System.out.println("I'm thinking of a number between 1 and " + range);

            while (guess != targetNum && tries < noOfTries) {
                tries++;
                System.out.println("Try #" + tries);
                System.out.print("Guess the number (1 - " + range + "): ");
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
