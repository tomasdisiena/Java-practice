
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true) {
            String string = scanner.nextLine();

            if (string.equals("end")) {
                break;
            }

            if (!(string.equals("end"))) {
                count++;
            }
        }

        System.out.println(count);
    }
}
