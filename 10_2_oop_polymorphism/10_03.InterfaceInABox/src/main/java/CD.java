public class CD implements Packable {

    private String artist;
    private String name;
    private int publicationYear;
    private double weight;

    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public double weight() {
        return weight;
    }

    public String toString() {
        return this.getArtist() + ": " + this.getName() + " (" + this.getPublicationYear() + ")";
    }


}
