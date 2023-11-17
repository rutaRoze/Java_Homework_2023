package lt.techin.praktinis;

public class CupsCalculator {

    public void calculateCups(int numberOfCups) {

        int numOfBoxes = numberOfCups / 3;
        int unboxedCups = numberOfCups % 3;

        System.out.println("Dėžių: " + numOfBoxes);
        System.out.println("Liko puodelių: " + unboxedCups);

//        System.out.println(numberOfCups % 3);

    }

}
