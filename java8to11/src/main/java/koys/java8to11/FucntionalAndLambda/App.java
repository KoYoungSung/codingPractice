package koys.java8to11.FucntionalAndLambda;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();

        UnaryOperator<String> hi = Greeting::hi;
        hi.apply("ko");

        UnaryOperator<String> hello = greeting::hello;
        hello.apply("ko");

        Supplier<Greeting> newGreeting = Greeting::new;
        newGreeting.get();

        Function<String, Greeting> KoGreeting = Greeting::new;
        Greeting ko = KoGreeting.apply("ko");


    }
}

