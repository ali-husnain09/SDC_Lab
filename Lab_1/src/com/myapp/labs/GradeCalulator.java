package com.myapp.labs;

import java.util.Scanner;

public class GradeCalulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scanner.nextLine();
        System.out.println("Enter Your Roll No.");
        int roll = scanner.nextInt();
        System.out.println("Enter Your Subjects Marks (0-100) ");
        double marks = 0;
        for (int i = 1; i < 4; i++) {
            double subjectmarks;
            System.out.println("Enter Your " + i + " Subject Marks:");
            subjectmarks = scanner.nextDouble();

            if (subjectmarks >= 0 && subjectmarks <= 100) {
                marks += subjectmarks;
            } else {
                System.out.println("Invalid please enter between 0 to 100");
                i--;
            }

        }
        double percentage = (marks / 3) % 100;
        if (percentage >= 85) {
            System.out.println("Percentage " + percentage + "% Grade A");

        } else if (percentage >= 70) {
            System.out.println("Percentage " + percentage + "% Grade: B");
        } else if (percentage >= 55) {
            System.out.println("Percentage " + percentage + "% Grade: C");
        } else if (percentage >= 40) {
            System.out.println("Percentage " + percentage + "% Grade: D");
        } else {
            System.out.println("Percentage " + percentage + "% Grade: F");
        }
        scanner.close();
    }

}
