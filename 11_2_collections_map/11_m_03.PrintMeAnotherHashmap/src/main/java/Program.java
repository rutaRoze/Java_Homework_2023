
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "pre");

    }

    public static void printValues(HashMap<String, Book> hashmap) {

        for (Map.Entry<String, Book> entry : hashmap.entrySet()) {
            System.out.println(entry.getValue());
        }

        //hashmap.forEach((key, value) -> System.out.println(value));
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {

        for (Map.Entry<String, Book> entry : hashmap.entrySet()) {
            if (entry.getValue().getName().contains(text)) {
                System.out.println(entry.getValue());
            }
        }

        //hashmap.entrySet().stream().filter(v -> v.getValue().getName().contains(text)).forEach((v) -> System.out.println(v.getValue()));
    }

}
