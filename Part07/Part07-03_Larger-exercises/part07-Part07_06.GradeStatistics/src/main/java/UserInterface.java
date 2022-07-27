/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasdisiena
 */
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Course course;

    public UserInterface(Scanner scanner, Course course) {
        this.scanner = scanner;
        this.course = course;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printAverages();
        printGradesDistribution();
    }

    public void readPoints() {
        System.out.println("Enter points totals, -1 stops:");

        while (true) {
            int points = Integer.valueOf(scanner.nextLine());

            if (points == -1) {
                break;
            }
            this.course.addGradesAsPoints(points);
        }
    }

    public void printAverages() {
        System.out.println("Point average (all): " + this.course.getAverage());
        System.out.println("Point average (passing): " + this.course.getPassAverage());
        System.out.println("Pass percentage: " + this.course.getPassPercentage());
    }

    public void printGradesDistribution() {
        System.out.println("Grade distribution:");
        System.out.println("5: " + this.course.getGradeAsStars(5));
        System.out.println("4: " + this.course.getGradeAsStars(4));
        System.out.println("3: " + this.course.getGradeAsStars(3));
        System.out.println("2: " + this.course.getGradeAsStars(2));
        System.out.println("1: " + this.course.getGradeAsStars(1));
        System.out.println("0: " + this.course.getGradeAsStars(0));
    }
}
