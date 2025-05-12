import java.util.Scanner;

public class GradeTracker {

    static final int FAILING_MARKS = 40;
    static final int FULL_MARKS = 100;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("[-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-]");
        System.out.println("Welcome to Grade Tracker");
        System.out.println();

        System.out.print("Enter number of students: ");
        int numStudents = scn.nextInt();

        String[] names = new String[numStudents];
        int[] marks = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student's name: ");
            names[i] = scn.next();

            System.out.print("Enter student's marks: ");
            marks[i] = scn.nextInt();
        }
        System.out.println();

        int action;

        do {
            System.out.println("1. View Class Average");
            System.out.println("2. View Topper");
            System.out.println("3. View Passed/Failed Students");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Choose action [1 - 4]: ");
            action = scn.nextInt();

            switch (action) {
                case 1:
                    classAvg(marks, numStudents);
                    break;
                case 2:
                    viewTopper(names, marks);
                    break;
                case 3:
                    passOrFail(names, marks);
                    break;
                case 4:
                    System.out.println("Thanks for using Grade Tracker!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println();

        } while (action != 4);

        System.out.println("[-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-]");
        scn.close();
    }

    public static void classAvg(int[] marks, int numStudents) {
        int total = 0;

        for (int i = 0; i < numStudents; i++) {
            total += marks[i];
        }

        double avg = (double) total / numStudents;
        System.out.println("Class Average = " + avg);
    }

    public static void viewTopper(String[] names, int[] marks) {
        int highest = marks[0];
        String topper = names[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
                topper = names[i];
            }
        }

        System.out.println("Topper is " + topper + " with marks " + highest);
    }

    public static void passOrFail(String[] names, int[] marks) {
        System.out.println("Pass/Fail Report:");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= FAILING_MARKS && marks[i] <= FULL_MARKS) {
                System.out.println(names[i] + " passed with " + marks[i] + " marks.");
            } else {
                System.out.println(names[i] + " failed with " + marks[i] + " marks.");
            }
        }
    }
}
