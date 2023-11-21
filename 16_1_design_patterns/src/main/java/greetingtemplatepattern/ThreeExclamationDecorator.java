package greetingtemplatepattern;

public class ThreeExclamationDecorator implements GreeterInterface {

    GreeterInterface greetingDecorator;

    public ThreeExclamationDecorator(GreeterInterface greetingDecorator) {
        this.greetingDecorator = greetingDecorator;
    }

    @Override
    public void greet(String firstName, String lastName) {
        greetingDecorator.greet(firstName, lastName);
        System.out.println("!!!");
    }
}
