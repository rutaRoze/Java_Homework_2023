import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = scan.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.parseInt(scan.nextLine());

            System.out.println("Publication year:");
            int year = Integer.parseInt(scan.nextLine());

            Book bookInfo = new Book(title, pages, year);

            books.add(bookInfo);
        }

        System.out.println();

        System.out.println("What information will be printed?");
        String answer = scan.nextLine();

        for (Book book : books) {
            if (answer.equals("name")) {
                System.out.println(book.getTitle());
            } else {
                System.out.println(book);
            }
        }
    }


}
