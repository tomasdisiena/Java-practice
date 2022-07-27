
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);

            if (input.equals("add " + amount)) {
                firstContainer.add(amount);
            }

            if (input.equals("move " + amount)) {
                if (amount > firstContainer.contains()) {
                    amount = firstContainer.contains();
                }

                firstContainer.remove(amount);
                secondContainer.add(amount);
            }

            if (input.equals("remove " + amount)) {
                secondContainer.remove(amount);
            }
            System.out.println("");
        }
    }

}
