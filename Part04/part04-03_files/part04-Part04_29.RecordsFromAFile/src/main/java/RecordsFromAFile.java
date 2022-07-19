
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] lines = line.split(",");

                if (Integer.valueOf(lines[1]) == 1) {
                    System.out.println(lines[0] + ", age: " + lines[1] + " year");
                } else {
                    System.out.println(lines[0] + ", age: " + lines[1] + " years");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
