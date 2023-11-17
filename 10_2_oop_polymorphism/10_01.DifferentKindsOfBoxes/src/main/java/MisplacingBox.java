import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> itemsBox;

    public MisplacingBox() {
        this.itemsBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {

        itemsBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {

        if (itemsBox.contains(item)) {
            return false;
        }
        return false;
    }
}
