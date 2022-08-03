
public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        ProductWarehouse pwh = new ProductWarehouseWithHistory("coffee", 10, 5);

        System.out.println(pwh.takeFromWarehouse(7));
    }

}
