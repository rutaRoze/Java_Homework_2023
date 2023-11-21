package greetingdecoratorpattern;

public class Main {

    public static void main(String[] args) {

        Greeter greeterExMark = new GreeterExclamationMarkDecorator(new GreeterImpl());
        System.out.println(greeterExMark.greet("ruta", "ro"));

        Greeter greeterAll = new GreeterUpperCaseDecorator(new GreeterExclamationMarkDecorator(new GreeterImpl()));
        System.out.println(greeterAll.greet("ruta", "ro"));

    }
}
