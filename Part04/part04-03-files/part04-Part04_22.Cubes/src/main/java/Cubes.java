
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String string = scanner.nextLine();
            
            if(string.equals("end")){
                break;
            }
            
            int num = Integer.valueOf(string);
            System.out.println(num * num * num);
        }
    }
}
