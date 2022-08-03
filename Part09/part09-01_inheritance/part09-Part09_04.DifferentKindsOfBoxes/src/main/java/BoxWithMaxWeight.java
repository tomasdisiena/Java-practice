
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
public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int currentWeight = 0;
        for (Item inBoxItem : items) {
            currentWeight += inBoxItem.getWeight();
        }
        
        if(currentWeight + item.getWeight() <= this.maxWeight){
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }
        return false;
    }

}
