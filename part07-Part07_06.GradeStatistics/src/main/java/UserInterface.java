/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
import java.util.Scanner;

public class UserInterface {

    private GradeList grades;
    private Scanner userInput;

    public UserInterface(GradeList grades, Scanner userInput) {
        this.grades = grades;
        this.userInput = userInput;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        readGrades();
        printGradeDistribution();
    }

    public void readGrades() {
        while (true) {
            int points = Integer.valueOf(userInput.nextLine());
            if (points == -1) {
                break;
            }

            grades.add(points);
        }
    }

    public void printGradeDistribution() {
        System.out.println("Point average (all): " + grades.getAverageOfAll());
        System.out.print("Point average (passing): ");
        if (grades.getAverageOfPassing() == 0) {
            System.out.println("-");
        } else {
            System.out.println(grades.getAverageOfPassing());
        }
        System.out.println("Pass percentage: " + grades.getPercentageOfPassing());
        System.out.println("Grade distribution:");
        int grade = 5;
        while (grade >= 0) {
            System.out.print(grade + ": ");
            printStars(grades.getNumberOfGrade(grade));
            System.out.println();
            grade--;
        }
    }

    private void printStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }

}
