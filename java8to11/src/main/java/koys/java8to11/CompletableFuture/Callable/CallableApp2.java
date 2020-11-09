package koys.java8to11.CompletableFuture.Callable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CallableApp2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "HELLO";
        };

        Callable<String> java = () -> {
            Thread.sleep(4000L);
            return "java";
        };

        Callable<String> ko = () -> {
            Thread.sleep(1000L);
            return "ko";
        };
     /*
        //invokAll
        List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello, java, ko));
        for (Future<String> f : futures) {
            System.out.println(f.get());
        }*/
        String s = executorService.invokeAny(Arrays.asList(hello, java, ko));
        System.out.println(s);

        executorService.shutdown();
    }
}
