
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, age));
        }

        System.out.println(books.size() + " books in total. \n");
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecommendedAge)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        books.forEach(book -> System.out.println(book));

    }

}
