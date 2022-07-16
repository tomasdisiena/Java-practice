
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String oldestName = "";

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            } else {

            }

            String[] array = text.split(",");
            if (Integer.valueOf(array[1]) > oldestAge) {
                oldestAge = Integer.valueOf(array[1]);
                oldestName = array[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
