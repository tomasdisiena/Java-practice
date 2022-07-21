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

public class Suitcase {
    private ArrayList<Item> items;
    private int currentWeight;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.currentWeight = 0;
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (item.getWeight() + this.currentWeight <= this.maxWeight) {
            this.items.add(item);
            this.currentWeight += item.getWeight();
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public Item heaviestItem() {
        if(this.items.isEmpty()){
            return null;
        }
        
        Item heaviest = this.items.get(0);

        for (Item item : this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0kg)";
        }

        if (this.items.size() == 1) {
            return "1 item (" + this.currentWeight + " kg)";
        }
        return this.items.size() + " items (" + this.currentWeight + "kg)";
    }

}
