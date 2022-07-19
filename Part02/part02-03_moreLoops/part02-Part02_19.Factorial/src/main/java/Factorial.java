
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int factorial = 1;

        if (num == 0) {
            factorial = 1;
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }

        System.out.println("Factorial: " + factorial);

    }
}
