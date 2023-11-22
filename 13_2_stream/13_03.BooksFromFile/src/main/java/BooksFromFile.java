
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        ArrayList<Book> readBooks = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(parts -> new Book(parts[0],
                            Integer.parseInt(parts[1]),
                            Integer.parseInt(parts[2]),
                            parts[3]))
                    .forEach(book -> readBooks.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return readBooks;
    }

}
