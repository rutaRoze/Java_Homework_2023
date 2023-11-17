import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> boxOfItems;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        boxOfItems = new ArrayList<>();
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void add(Packable item) {

        if (weight() + item.weight() <= this.getMaxCapacity()) {
            boxOfItems.add(item);
        }
    }

    @Override
    public double weight() {
//        double totalWeight = 0;
//        for (Packable item : boxOfItems) {
//            totalWeight += item.weight();
//        }
//        return totalWeight;

        return boxOfItems
                .stream()
                .mapToDouble(Packable::weight)
                .sum();
    }

    public String toString() {
        return "Box: " + this.boxOfItems.size() + " items, total weight " + this.weight() + " kg";
    }
}
