
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int positives = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                positives += 1;
                sum += num;
                continue;
            }
           
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sum / positives);
        }
    }
}
