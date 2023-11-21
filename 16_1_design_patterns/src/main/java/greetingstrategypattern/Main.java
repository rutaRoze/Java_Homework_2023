package greetingstrategypattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Greeter greet = new Greeter();

        greet.setGreeting(new LithuanianGreetingStrategy());
        System.out.println(greet.greet("ruta", "ro"));

        System.out.println();

        greet.setGreeting(new EnglishGreetingStrategy());
        System.out.println(greet.greet("ruta", "ro"));
    }
}