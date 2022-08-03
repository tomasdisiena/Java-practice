
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tomasdisiena
 */
public class Box implements Packable {

    private ArrayList<Packable> box;
    private double maxWeight;

    public Box(double weight) {
        this.box = new ArrayList<>();
        this.maxWeight = weight;
    }

    public void add(Packable newItem) {
        if (this.weight() + newItem.weight() <= this.maxWeight) {
            box.add(newItem);
        }
    }

    @Override
    public double weight() {
        double currentWeight = 0;
        for (Packable item : box) {
            currentWeight += item.weight();
        }
        return currentWeight;
    }

    @Override
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }

}
