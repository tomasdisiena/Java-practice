
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int longestNameLength = 0;
        
        int sum = 0;
        int count = 0;
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            } else {

            }

            String[] array = text.split(",");
            if (Integer.valueOf(array[0].length()) > longestNameLength) {
                longestNameLength = Integer.valueOf(array[0].length());
                longestName = array[0];
            }
            sum += Integer.valueOf(array[1]);
            count++;
        }
        System.out.println("Longest name:" + longestName);
        System.out.println("Average of the birth years:" + (1.0 * sum / count));
    }
}
