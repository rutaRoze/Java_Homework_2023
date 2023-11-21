package greetingstrategypattern;

public class Greeter {

    private GreeterLanguageStrategy greeterLanguageStrategy;

    public Greeter() {

    }

    public void setGreeting(GreeterLanguageStrategy greeting) {
        this.greeterLanguageStrategy = greeting;
    }

    public String greet(String firstName, String lasName) {
        return this.greeterLanguageStrategy.getGreetingString() + " " + firstName + " " + lasName;
    }


}
