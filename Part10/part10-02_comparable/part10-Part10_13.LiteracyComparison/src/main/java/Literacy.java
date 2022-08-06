/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasdisiena
 */
public class Literacy {

    private String country;
    private int year;
    private String gender;
    private double percentage;

    public Literacy(String country, int year, String gender, double percentage) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.percentage = percentage;
    }

    public double getPercentage() {
        return this.percentage;
    }

    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.percentage;
    }
}
