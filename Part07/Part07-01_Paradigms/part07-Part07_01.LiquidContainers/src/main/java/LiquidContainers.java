
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
//            System.out.print("> ");

            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);

            if (input.equals("add " + amount)) {
                if (amount > 0 && amount + firstContainer <= 100) {
                    firstContainer += amount;
                } else if (amount + firstContainer > 100) {
                    firstContainer = 100;
                }
            }

            if (input.equals("move " + amount)) {
                if (!(firstContainer == 0)) {
                    if (amount > 0 && amount + secondContainer <= 100) {
                        if (firstContainer - amount < 0) {
                            secondContainer += amount + (firstContainer - amount);
                            firstContainer = 0;
                        } else {
                            firstContainer -= amount;
                            secondContainer += amount;
                        }
                    } else if (amount + secondContainer > 100) {
                        firstContainer = 0;
                        secondContainer = 100;
                    }
                }
            }

            if (input.equals("remove " + amount)) {
                if (secondContainer - amount > 0) {
                    secondContainer -= amount;
                } else {
                    secondContainer = 0;
                }
            }

            System.out.println("");
        }
    }

}
