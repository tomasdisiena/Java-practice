/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasdisiena
 */
public class CD implements Packable {

    private String artist;
    private String cdName;
    private int publicationYear;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.cdName = name;
        this.publicationYear = year;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.cdName + " (" + this.publicationYear + ")";
    }

    @Override
    public double weight() {
        return 0.1;
    }

}
