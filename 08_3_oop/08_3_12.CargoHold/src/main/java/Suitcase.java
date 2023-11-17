import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    private int totalWeight = 0;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {

        if (this.totalWeight + item.getWeight() <= this.maxWeight) {
            this.totalWeight += item.getWeight();
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return this.totalWeight;
    }

    public Item heaviestItem() {

        if (items.isEmpty()) {
            return null;
        }

        int heviest = 0;
        Item heviestItem = this.items.get(0);

        for (Item item : this.items) {
            if (item.getWeight() > heviest) {
                heviest = item.getWeight();
                heviestItem = item;
            }
        }
        return heviestItem;
    }

    @Override
    public String toString() {

        int countOfItems = 0;
        int totalWeight = 0;

        for (Item item : items) {
            countOfItems++;
            totalWeight += item.getWeight();
        }

        if (countOfItems == 0) {
            return "no items (" + totalWeight + " kg)";
        }

        if (countOfItems == 1) {
            return countOfItems + " item (" + totalWeight + " kg)";
        }

        return countOfItems + " items (" + totalWeight + " kg)";
    }
}
