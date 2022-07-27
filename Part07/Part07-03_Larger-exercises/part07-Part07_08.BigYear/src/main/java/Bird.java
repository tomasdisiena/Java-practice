/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasdisiena
 */
public class Bird {

    private String name;
    private String nameLatin;
    private int observations;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observations = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getNameLatin() {
        return this.nameLatin;
    }

    public int getObservations() {
        return this.observations;
    }

    public void addObservation() {
        this.observations++;
    }

    public String toString() {
        return this.name + " (" + this.nameLatin + "): " + this.observations + " observations";
    }

}
