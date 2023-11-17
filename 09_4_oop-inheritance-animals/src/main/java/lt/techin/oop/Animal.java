package lt.techin.oop;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String paw = this.numberOfPaws == 1 ? "paw" : "paws";
        String fur = this.hasFur ? "a fur" : "no fur";

        return String.format("This animal is mostly %s. It has %d %s and %s.",
                this.color, this.numberOfPaws, paw, fur);
    }
}
