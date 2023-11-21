package greetingtemplatepattern;

public class PointDecorator implements GreeterInterface {

    GreeterInterface greetingDecorator;

    public PointDecorator(GreeterInterface greetingDecorator) {
        this.greetingDecorator = greetingDecorator;
    }

    @Override
    public void greet(String firstName, String lastName) {
        greetingDecorator.greet(firstName, lastName);
        System.out.println(".");
    }
}
