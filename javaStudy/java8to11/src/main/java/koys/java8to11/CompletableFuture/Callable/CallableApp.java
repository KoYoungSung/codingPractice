package koys.java8to11.CompletableFuture.Callable;

import java.util.concurrent.*;

public class CallableApp {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "HELLO";
        };

        Future<String> submit = executorService.submit(hello);
        System.out.println(submit.isDone());
        System.out.println("Started!");

//        submit.get();
        submit.cancel(false);

        System.out.println(submit.isDone());
        System.out.println("END!!");
        executorService.shutdown();
    }
}
