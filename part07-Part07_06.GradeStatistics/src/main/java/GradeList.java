/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
import java.util.ArrayList;

public class GradeList {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    private int numberOfPassing;

    public GradeList() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.numberOfPassing = 0;
    }

    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            points.add(grade);
            grades.add(pointsToGrade(grade));
            if (grade >= 50) {
                numberOfPassing++;
            }
        }
    }
    
    public void getGrades() {
        System.out.println(grades);
    }
    
    public int sumOfAll() {
        int sum = 0;
        for (int grade : points) {
            sum += grade;
        }
        
        return sum;
    }
    
    public int sumOfPassing() {
        int sum = 0;
        for (int grade : points) {
            if (grade >= 50) {
                sum += grade;
            }
        }
        
        return sum;
    }
    
    public double getAverageOfAll() {
        if (points.isEmpty()) {
            return 0;
        }
        return sumOfAll() / (double) points.size();
    }
    
    public double getAverageOfPassing() {
        if (numberOfPassing == 0) {
            return 0;
        }
        
        return sumOfPassing() / (double) numberOfPassing;
    }
    
    public double getPercentageOfPassing() {
        if (points.isEmpty()) {
            return 0;
        }
        
        return 100 * numberOfPassing / (double) points.size();
    }
    
    public int getNumberOfGrade(int number) {
        int numOfGrade = 0;
        for (int grade : grades) {
            if (grade == number) {
                numOfGrade++;
            }
        }
        
        return numOfGrade;
    }

    private int pointsToGrade(int points) {
        int grade = 0;
        
        if (points > 89) {
            grade = 5;
        } else if (points > 79) {
            grade = 4;
        } else if (points > 69) {
            grade = 3;
        } else if (points > 59) {
            grade = 2;
        } else if (points > 49) {
            grade = 1;
        } else {
            grade = 0;
        }
        
        return grade;
        
//      Testing different implementation below:        
//        if (points > 89) {
//            return 5;
//        }
//        if (points > 79) {
//            return 4;
//        }
//        if (points > 69) {
//            return 3;
//        }
//        if (points > 59) {
//            return 2;
//        }
//        if (points > 49) {
//            return 1;
//        } else {
//            
//            return 0;
//        }
    }
}
