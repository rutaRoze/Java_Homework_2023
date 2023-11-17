public class Book implements Packable {
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.getAuthor() + ": " + this.getName();
    }
}
