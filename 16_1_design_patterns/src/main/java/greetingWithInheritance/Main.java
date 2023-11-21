package greetingWithInheritance;

public class Main {

    public static void main(String[] args) {

        GreeterImpl greeterExMark = new GreeterExclamationMarkDecorator();
        System.out.println(greeterExMark.greet("ruta", "ro"));

        GreeterImpl greeterAll = new GreeterUpperCaseDecorator();
        System.out.println(greeterAll.greet("ruta", "ro"));

    }
}
