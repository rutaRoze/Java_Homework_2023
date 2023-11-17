import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    private int totalSuitcaseWeight = 0;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalSuitcaseWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.totalSuitcaseWeight += suitcase.totalWeight();
            this.suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {

        int countOfSuitcases = 0;
        int totalWeightOfSuicases = 0;

        for (Suitcase suitcase : this.suitcases) {
            countOfSuitcases++;
            totalWeightOfSuicases += suitcase.totalWeight();
        }

        return countOfSuitcases + " suitcases (" + totalWeightOfSuicases + " kg)";
    }
}
