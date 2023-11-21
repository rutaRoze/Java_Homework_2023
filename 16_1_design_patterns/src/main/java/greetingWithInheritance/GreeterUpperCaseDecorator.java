package greetingWithInheritance;

public class GreeterUpperCaseDecorator extends GreeterImpl {


    @Override
    public String greet(String firstName, String lastName) {
        return super.greet(firstName, lastName).toUpperCase();
    }

}
