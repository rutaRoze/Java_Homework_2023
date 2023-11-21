package greetingdecoratorpattern;

public class GreeterDecorator implements Greeter {

    //could be extended to decoration options as middle man
    // between implementation class and type of decorations
    //https://www.baeldung.com/java-decorator-pattern
    private Greeter greeter;

    public GreeterDecorator(Greeter greeter) {
        this.greeter = greeter;
    }


    @Override
    public String greet(String firstName, String lastName) {
        return greeter.greet(firstName, lastName);
    }
}
