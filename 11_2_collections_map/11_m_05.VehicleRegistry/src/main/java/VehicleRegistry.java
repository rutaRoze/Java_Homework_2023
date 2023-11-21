import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        for (LicensePlate plate : registry.keySet()) {
            if (plate.equals(licensePlate)) {
                return false;
            }
        }

//        if (registry.containsKey(licensePlate)) {
//            return false;
//        }

        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        for (LicensePlate plate : registry.keySet()) {
            if (plate.equals(licensePlate)) {
                return registry.get(licensePlate);
            }
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        for (LicensePlate plate : registry.keySet()) {
            if (plate.equals(licensePlate)) {
                registry.remove(plate);
                return true;
            }
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : registry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {

        ArrayList<String> alreadyPrintedOwners = new ArrayList<>();
        for (String owner : registry.values()) {
            if (!alreadyPrintedOwners.contains(owner)) {
                alreadyPrintedOwners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
