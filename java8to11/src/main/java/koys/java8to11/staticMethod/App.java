package koys.java8to11.staticMethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("ko");
        name.add("bak");
        name.add("lee");
        name.add("cho");

  /*      name.forEach(System.out::println);
        System.out.println("=============================");

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();

        while (spliterator.tryAdvance(System.out::println));
        System.out.println("=============================");
        while (spliterator1.tryAdvance(System.out::println));

        name.removeIf(s -> s.startsWith("k"));
        while (spliterator.tryAdvance(System.out::println));

        System.out.println("------------------------------------");


        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(String::compareToIgnoreCase);
        name.sort(compareToIgnoreCase.reversed());*/
        List<String> stringStream = name.stream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();

        }).collect(Collectors.toList());
        System.out.println("------------------------");
        name.forEach(System.out::println);

        List<String> collect = name.parallelStream().map(String::toUpperCase).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }


}
