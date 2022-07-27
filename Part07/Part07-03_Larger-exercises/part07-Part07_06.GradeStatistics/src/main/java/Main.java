
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course course = new Course();
        UserInterface ui = new UserInterface(scanner, course);
        
        ui.start();
    }
}
