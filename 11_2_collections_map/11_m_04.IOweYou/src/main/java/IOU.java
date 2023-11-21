import java.util.HashMap;
import java.util.Map;

public class IOU {

    private HashMap<String, Double> debtList;

    public IOU() {
        this.debtList = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.debtList.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {

        return this.debtList.getOrDefault(toWhom, 0.0);

        //1st version
//        if(debtList.containsKey(toWhom)) {
//            return debtList.get(toWhom);
//        }
//
//        return 0;

        //2nd version (stream not working)
       //return debtList
        // .entrySet()
        // .stream()
        // .filter(k -> k.getKey() != null && k.getKey().contains(toWhom))
        // .findFirst().orElseThrow(() -> new IllegalArgumentException("0"));
    }
}
