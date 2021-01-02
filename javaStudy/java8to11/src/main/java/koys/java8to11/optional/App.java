package koys.java8to11.optional;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring boot jpa", true));
        springClasses.add(new OnlineClass(3, "spring boot mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest apu", false));

        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("jpa"))
                .findFirst();

        OnlineClass onlineClass1 = optional.get();
        System.out.println(onlineClass1.getTitle());

        OnlineClass onlineClass = optional.orElseGet(App::createNewClass);



    }

    private static OnlineClass createNewClass() {
        return new OnlineClass(10, "springJPA", false);
    }
}
