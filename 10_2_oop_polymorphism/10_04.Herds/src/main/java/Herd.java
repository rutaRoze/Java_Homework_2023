import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> movingOrganisms;

    public Herd() {
        this.movingOrganisms = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        movingOrganisms.add(movable);
    }

    public String toString() {

        String output = "";
        for (Movable org : movingOrganisms) {
            output += org + "\n";
        }
        return output;
    }

    @Override
    public void move(int dx, int dy) {

        for (Movable org : movingOrganisms) {
            org.move(dx, dy);
        }
    }
}
