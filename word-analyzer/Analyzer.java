import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("[-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-]");
        System.out.println("Welcome to Word Analyzer!");
        System.out.println("Enter a sentence: ");
        System.out.print(">");
        String sentence = scn.nextLine();
        System.out.println();

        while (true) {
            chooseAction(sentence);

            System.out.println("Do you want to continue? (Yes[y]/Non[n])");
            System.out.print(">");
            String option = scn.next();
            System.out.println();

            if (option.equalsIgnoreCase("n") || option.equalsIgnoreCase("no")) {
                System.out.println("Thanks for using Word Analyzer");
                break;
            }
        }

        scn.close();
    }

    public static void chooseAction(String sentence) {
        Scanner scn = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("1. Count characters");
        System.out.println("2. Count words");
        System.out.println("3. Count vowels and consonants");
        System.out.println("4. Check if palindrome");
        System.out.println("5. Print each word separately");
        System.out.println();

        System.out.println("Enter choice: ");
        System.out.print(">");
        int choice = scn.nextInt();
        System.out.println();

        if (choice == 1) {
            countChar(sentence);
        } else if (choice == 2) {
            countWords(sentence);
        } else if (choice == 3) {
            vowelsAndConsonants(sentence);
        } else if (choice == 4) {
            palindrome(sentence);
        } else if (choice == 5) {
            printWords(sentence);
        } else {
            System.out.println("Invalid Choice!");
        }
    }

    public static void countChar(String sentence) {
        System.out.println("Number of characters (inclusive spaces): " + sentence.length());
    }

    public static void countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Number of words = " + words.length);
    }

    public static void vowelsAndConsonants(String sentence) {
        sentence = sentence.toLowerCase();
        int vowelCounter = 0;
        int consonantCounter = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCounter++;
                } else {
                    consonantCounter++;
                }
            }
        }

        System.out.println("Number of vowels = " + vowelCounter);
        System.out.println("Number of consonants = " + consonantCounter);
    }

    public static void palindrome(String sentence) {
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("\\s+", "");
        String reversed = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed += sentence.charAt(i);
        }

        if (sentence.equals(reversed)) {
            System.out.println("This sentence is a PALINDROME");
        } else {
            System.out.println("This sentence is NOT a PALINDROME");
        }
    }

    public static void printWords(String sentence) {
        String[] words = sentence.split("\\s+");

        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
