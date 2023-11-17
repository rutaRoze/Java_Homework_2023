
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

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String longestElementName = "";
        int longest = 0;
        for (String element : this.elements) {
            if (element.length() > longest) {
                longest += element.length();
                longestElementName = element;
            }
        }

        return longestElementName;
    }

}
