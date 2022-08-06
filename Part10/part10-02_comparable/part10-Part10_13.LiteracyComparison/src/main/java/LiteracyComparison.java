
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Literacy> list = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .map(parts -> new Literacy(parts[3], Integer.valueOf(parts[4]), parts[2].replace("(%)", "").trim(), Double.valueOf(parts[5])))
                    .forEach(literacy -> list.add(literacy));
        } catch (Exception e) {
            System.out.println(e);
        }

        list.stream().sorted((t1, t2) -> {
            if (t1.getPercentage() > t2.getPercentage()) {
                return 1;
            }
            if (t1.getPercentage() < t2.getPercentage()) {
                return -1;
            }
            return 0;
        }).forEach(t -> System.out.println(t));
    }
}
