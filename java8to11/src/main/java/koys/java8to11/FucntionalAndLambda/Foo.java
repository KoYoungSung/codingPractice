package koys.java8to11.FucntionalAndLambda;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {
    public static void main(String[] args) {

        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i *2;
        Function<Integer, Integer> com = plus10.compose(multiply2);
        Function<Integer, Integer> com2 = plus10.andThen(multiply2);
        System.out.println(com.apply(2));
        System.out.println(com2.apply(2));

        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        Predicate<String> startWithKO = (s) -> s.startsWith("ko");
        Predicate<Integer> isOdd = (i) -> i%2 == 1;

        UnaryOperator<Integer> plus3 = (i) -> i + 3;
        System.out.println(plus3.apply(3));
    }
}