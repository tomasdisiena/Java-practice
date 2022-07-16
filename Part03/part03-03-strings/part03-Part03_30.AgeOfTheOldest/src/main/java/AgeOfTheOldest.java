
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            } else {

            }

            String[] array = text.split(",");
            if (Integer.valueOf(array[1]) > oldest ) {
                oldest = Integer.valueOf(array[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
