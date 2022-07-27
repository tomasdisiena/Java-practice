

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tomasdisiena
 */
import java.util.ArrayList;

public class Course {

    private ArrayList<Integer> gradesAsPoints;
    private ArrayList<Integer> grades;
    private int students;

    public Course() {
        this.gradesAsPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.students = 0;
    }

    public int getCount() {
        return this.students;
    }

    public ArrayList getGradesAsPoints() {
        return this.gradesAsPoints;
    }

    public void addGradesAsPoints(int points) {
        if (points >= 0 && points <= 100) {
            this.gradesAsPoints.add(points);
            this.students++;

            if (points < 50) {
                this.grades.add(0);
            } else if (points < 60) {
                this.grades.add(1);
            } else if (points < 70) {
                this.grades.add(2);
            } else if (points < 80) {
                this.grades.add(3);
            } else if (points < 90) {
                this.grades.add(4);
            } else if (points <= 100) {
                this.grades.add(5);
            }
        }
    }

    public double getAverage() {
        int sum = 0;
        for (int grade : this.gradesAsPoints) {
            sum += grade;
        }
        return 1.0 * sum / this.students;
    }

    public double getPassAverage() {
        int sum = 0;
        int count = 0;
        for (int grade : this.gradesAsPoints) {
            if (grade >= 50) {
                sum += grade;
                count++;
            }
        }
        return 1.0 * sum / count;
    }

    public double getPassPercentage() {
        int count = 0;
        for (int grade : this.gradesAsPoints) {
            if (grade >= 50) {
                count++;
            }
        }
        return 100.0 * count / this.students;
    }

    public String getGradeAsStars(int g) {
        int count = 0;
        String stars = "";
        for (int grade : this.grades) {
            if (g == grade) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            stars += "*";
        }
        return stars;
    }
}
