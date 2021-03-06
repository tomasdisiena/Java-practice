
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);

        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("?");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Name in Latin: ");
                String nameLatin = scanner.nextLine();

                birds.add(new Bird(name, nameLatin));
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                boolean found = false;

                for (Bird bird : birds) {
                    if (bird.getName().equals(birdName)) {
                        bird.addObservation();
                        found = true;
                    }
                }

                if (found == false) {
                    System.out.println("Not a bird!");
                }
            }

            if (command.equals("All")) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                boolean found = false;

                for (Bird bird : birds) {
                    if (bird.getName().equals(birdName)) {
                        System.out.println(bird);
                        found = true;
                    }
                }

                if (found == false) {
                    System.out.println("Not a bird!");
                }
            }
        }
    }

}
