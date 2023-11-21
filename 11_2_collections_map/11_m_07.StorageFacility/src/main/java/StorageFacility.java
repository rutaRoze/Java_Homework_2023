import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    HashMap<String, ArrayList<String>> unitsList;

    public StorageFacility() {
        this.unitsList = new HashMap<>();
    }

    public void add(String unit, String item) {
        unitsList.putIfAbsent(unit, new ArrayList<>());
        unitsList.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return unitsList.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {

        unitsList.get(storageUnit).remove(item);

        if (unitsList.get(storageUnit).isEmpty()) {
            unitsList.remove(storageUnit);
        }

    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsContainingItems = new ArrayList<>();

        for (String unit : unitsList.keySet()) {
            if (!unitsList.get(unit).isEmpty()) {
                unitsContainingItems.add(unit);
            }
        }

        return unitsContainingItems;

    }
}
