package greetingtemplatepattern;

public abstract class Greeter implements GreeterInterface {

    public void greet(String firstName, String lastName) {
        System.out.print(getGreetingString() + " " + firstName + " " + lastName);
    }

    protected abstract String getGreetingString();

}
