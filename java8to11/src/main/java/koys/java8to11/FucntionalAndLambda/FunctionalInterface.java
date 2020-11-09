package koys.java8to11.FucntionalAndLambda;

import java.util.function.Function;

public class FunctionalInterface implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer + 10;
    }
}
