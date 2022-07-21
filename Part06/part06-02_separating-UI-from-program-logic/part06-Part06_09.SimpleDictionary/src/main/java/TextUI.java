/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasdisiena
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();

                System.out.println("Translation:");
                String translation = scanner.nextLine();

                this.dictionary.add(word, translation);
                continue;
            }

            if (command.equals("search")) {
                System.out.println("To be translated:");
                String toBeTranslated = scanner.nextLine();

                if (this.dictionary.translate(toBeTranslated) == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println("Translation:");
                    System.out.println(this.dictionary.translate(toBeTranslated));
                }
                continue;
            }

            System.out.println("Unknown command");
        }
    }

}
