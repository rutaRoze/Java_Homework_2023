package greetingtemplatepattern;

public class Main {

    public static void main(String[] args) {

        GreeterInterface greeter = new PointDecorator(new LithuanianGreeter());
        greeter.greet("ruta", "ro");


        greeter = new ThreeExclamationDecorator(new EnglishGreeter());
        greeter.greet("ruta", "ro");


        greeter = new ExclamationDecorator(new EnglishGreeter());
        greeter.greet("ruta", "ro");

    }
}
