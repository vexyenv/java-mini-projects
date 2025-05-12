import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Student[] students = new Student[10];
        int studentCount = 0;

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scn.nextInt();
            scn.nextLine();

            if (choice == 1) {
                if (studentCount < students.length) {
                    System.out.print("Enter student's name: ");
                    String name = scn.nextLine();

                    System.out.print("Enter student's age: ");
                    int age = scn.nextInt();

                    System.out.print("Enter student's percentage: ");
                    double percentage = scn.nextDouble();

                    students[studentCount] = new Student(name, age, percentage);
                    studentCount++;
                    System.out.println("Student Added!");
                } else {
                    System.out.println("Student list is full...");
                }
            } else if (choice == 2) {
                if (studentCount == 0) {
                    System.out.println("No students to display!");
                } else {
                    for (int i = 0; i < studentCount; i++) {
                        students[i].showDetails();
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter student's name for marks update: ");
                String name = scn.nextLine();
                boolean found = false;
                for (int i = 0; i < studentCount; i++) {
                    if (students[i].name.equals(name)) {
                        System.out.print("Enter new percentage: ");
                        double newPercentage = scn.nextDouble();
                        students[i].updatePercentage(newPercentage);
                        found = true;
                        System.out.println("Percentage updated!");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student Not Found!");
                }
            } else if (choice == 4) {
                System.out.print("Enter student name to delete: ");
                String name = scn.nextLine();
                boolean found = false;

                for (int i = 0; i < studentCount; i++) {
                    if (students[i].name.equals(name)) {
                        for (int j = i; j < studentCount - 1; j++) {
                            students[j] = students[j + 1];
                        }
                        students[studentCount - 1] = null;
                        studentCount--;
                        found = true;
                        System.out.println("Student deleted!");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student Not Found!");
                }
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid Choice!");
            }
        }

        scn.close();
    }
}

class Student {
    String name;
    int age;
    double percentage;

    Student(String name, int age, double percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    void showDetails() {
        System.out.println("Student's Name: " + this.name);
        System.out.println("Student's Age: " + this.age);
        System.out.println("Student's Percentage: " + this.percentage);
    }

    void updatePercentage(double newPercentage) {
        this.percentage = newPercentage;
    }
}