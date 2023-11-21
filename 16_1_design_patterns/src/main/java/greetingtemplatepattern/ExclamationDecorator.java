package greetingtemplatepattern;

public class ExclamationDecorator implements GreeterInterface {

    GreeterInterface greetingDecorator;

    public ExclamationDecorator(GreeterInterface greetingDecorator) {
        this.greetingDecorator = greetingDecorator;
    }

    @Override
    public void greet(String firstName, String lastName) {
        greetingDecorator.greet(firstName, lastName);
        System.out.println("!");
    }
}
