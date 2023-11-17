
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String printStartOfMessage = "The collection " + this.name;

        if (this.elements.isEmpty()) {
            return printStartOfMessage + " is empty.";
        }

        String element = "";
        for (String item : this.elements) {
            element = element + "\n" + item;
        }

        if (this.elements.size() == 1) {
            return printStartOfMessage + " has " + this.elements.size() + " element:" + element;
        }

        return printStartOfMessage + " has " + this.elements.size() + " elements:" + element;

    }

}
