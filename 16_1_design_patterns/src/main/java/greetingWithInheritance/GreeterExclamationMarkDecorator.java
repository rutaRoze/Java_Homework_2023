package greetingWithInheritance;

public class GreeterExclamationMarkDecorator extends GreeterImpl {

    @Override
    public String greet(String firstName, String lastName) {
        return super.greet(firstName, lastName) + decorateWithExclamationMark();
    }

    public String decorateWithExclamationMark() {
        return "!";
    }


}
