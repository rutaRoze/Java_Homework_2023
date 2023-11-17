import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        int shortest = 999;
        Person shortestPerson = persons.get(0);
        for (Person person : persons) {
            if (person.getHeight() < shortest) {
                shortest = person.getHeight();
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortest = this.shortest();
        persons.remove(shortest);
        return shortest;
    }
}
