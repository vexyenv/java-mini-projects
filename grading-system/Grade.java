import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("Grading System (Marks out of 100)");

        for (int j = 1;; j++) {
            System.out.print("Enter number of subjects: ");
            int sub = sc.nextInt();

            double marks = 0;
            for (int i = 1; i <= sub; i++) {
                System.out.print("Enter marks for subject #" + i + ": ");
                marks += sc.nextDouble();
            }

            double totalMarks = marks;
            double avg = marks / sub;
            double percent = (totalMarks / (sub * 100)) * 100;

            System.out.println(" ");
            System.out.println("Your total score = " + totalMarks);
            System.out.println("Your average score = " + avg);
            System.out.println("Your percentage = " + percent + "%");

            String grade = (percent <= 100 && percent >= 90) ? "Grade A+"
                    : (percent <= 89 && percent >= 80) ? "Grade A"
                    : (percent <= 79 && percent >= 70) ? "Grade B"
                    : (percent <= 69 && percent >= 60) ? "Grade C"
                    : (percent <= 59 && percent >= 50) ? "Grade D"
                    : (percent <= 49 && percent >= 0) ? "Grade F" : "Invalid marks";

            System.out.println(grade);
            System.out.println("----------------------------------------");

            System.out.print("Do you want to continue? (Yes[y]/No[n]): ");
            String option = sc.next();

            if (option.equalsIgnoreCase("no") || option.equalsIgnoreCase("n")) {
                System.out.println("Enjoy your day!");
                break;
            }
        }

        sc.close();
    }
}