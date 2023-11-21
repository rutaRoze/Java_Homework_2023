package greetingstrategypattern;

public class EnglishGreetingStrategy implements GreeterLanguageStrategy {
    @Override
    public String getGreetingString() {
        return "Hello";
    }
}
