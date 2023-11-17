import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int boxCapacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.boxCapacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int weightAdded = 0;
        for (Item i : items) {
            weightAdded += i.getWeight();
        }

        if (weightAdded + item.getWeight() <= this.boxCapacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item i : items) {
            if (i.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
