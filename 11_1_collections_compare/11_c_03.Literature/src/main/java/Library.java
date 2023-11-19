import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    protected ArrayList<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public void addBookToList(Book book) {
        bookList.add(book);
    }

    public int getNumberOfBooks() {
        return bookList.size();
    }

    public Collection<Book> getSortedBookList() {

        Comparator<Book> comparingByAge = Comparator
                .comparing(Book::getRecommendedAge)
                .thenComparing(Book::getBookName);

        List<Book> sorted = bookList.stream()
                .sorted(comparingByAge)
                .collect(Collectors.toList());

        return sorted;
    }

    public void printBookList() {
        System.out.println(getNumberOfBooks() + " books in total.\n");
        System.out.println("Books:");
        for (Book book : getSortedBookList()) {
            System.out.printf("%s (recommended fo %d year-olds od older)\n",
                    book.getBookName(), book.getRecommendedAge());
        }
    }
}
