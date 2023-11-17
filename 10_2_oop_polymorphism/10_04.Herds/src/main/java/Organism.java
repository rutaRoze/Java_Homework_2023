public class Organism implements Movable {

    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x: " + this.getX() + "; y: " + this.getY();
    }

    @Override
    public void move(int dx, int dy) {
        this.x = this.getX() + dx;
        this.y = this.getY() + dy;
    }
}
