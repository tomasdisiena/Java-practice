/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasdisiena
 */
public class Book implements Packable{
    private String author;
    private String bookName;
    private double bookWeight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.bookName = name;
        this.bookWeight = weight;
    }

    @Override
    public String toString(){
        return this.author + ": " + this.bookName;
    }
    
    @Override
    public double weight() {
        return this.bookWeight;
    }
    
}
