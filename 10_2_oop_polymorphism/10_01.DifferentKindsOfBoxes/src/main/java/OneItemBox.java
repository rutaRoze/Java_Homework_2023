import java.util.ArrayList;

public class OneItemBox extends Box {

    private Item oneItemOnly;

    public OneItemBox() {

    }

    @Override
    public void add(Item item) {
        if (oneItemOnly == null) {
            oneItemOnly = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return item.equals(oneItemOnly);
    }

//    private ArrayList<Item> oneItemOnly;
//
//    public OneItemBox() {
//        this.oneItemOnly = new ArrayList<>();
//    }
//
//    @Override
//    public void add(Item item) {
//
//        if (oneItemOnly.size() == 0) {
//            this.oneItemOnly.add(item);
//        }
//
//    }
//
//    @Override
//    public boolean isInBox(Item item) {
//
//        return oneItemOnly.contains(item);
//    }
}
