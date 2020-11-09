package koys.java8to11.CompletableFuture.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceApp {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();

    /*    ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(getRunnable("A"));
        executorService.submit(getRunnable("B"));
        executorService.submit(getRunnable("C"));
        executorService.submit(getRunnable("D"));
        executorService.submit(getRunnable("E"));*/

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(getRunnable("hello"), 1,2, TimeUnit.SECONDS);

//        executorService.shutdown();
    }


    private static Runnable getRunnable(String message) {
        return () -> System.out.println(message + Thread.currentThread().getName());
    }
}
