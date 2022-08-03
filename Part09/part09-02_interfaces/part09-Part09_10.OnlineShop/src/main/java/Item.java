
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasdisiena
 */
public class Item {

    private String productName;
    private int quantity;
    private int price;

    public Item(String product, int qty, int unitPrice) {
        this.productName = product;
        this.quantity = qty;
        this.price = unitPrice;
    }

    public int price() {
        return this.price * this.quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    public String toString() {
        return this.productName + ": " + this.quantity;
    }
}
