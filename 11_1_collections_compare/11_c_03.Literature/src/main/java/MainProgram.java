
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();
        while(true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();

            if(name.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation:");
            int age = Integer.parseInt(scanner.nextLine());

            Book book = new Book(name, age);
            library.addBookToList(book);
        }

        library.printBookList();

    }

}
