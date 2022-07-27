
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.print("File to read: ");
        String file = scanner.nextLine();
        
        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String name = fileReader.nextLine();
                int time = Integer.valueOf(fileReader.nextLine());
                Recipe recipe = new Recipe(name, time);

                while (fileReader.hasNextLine()) { // check until the newline
                    String ingredient = fileReader.nextLine();

                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredients(ingredient);
                }
                recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredients");
        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
                System.out.println("");
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().equals(name) || recipe.getName().contains(name)) {
                        System.out.println(recipe);
                    }
                }
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getCookingTime() <= time) {
                        System.out.println(recipe);
                    }
                }
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe);
                    }
                }
            }

        }

    }

}
