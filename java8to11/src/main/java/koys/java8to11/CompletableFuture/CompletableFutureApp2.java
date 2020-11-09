package koys.java8to11.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureApp2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            return "Hello";
        });

        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            return "Hello";
        });

      /*  CompletableFuture<String> future = hello.thenCombine(world, (h, w) -> h + "" + w);
        System.out.println(future);

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(hello, world)
                .thenAccept((result) -> {
                    System.out.println(result);
                });
        System.out.println(voidCompletableFuture);*/

        /*CompletableFuture<Void> future = CompletableFuture.anyOf(hello, world).thenAccept(System.out::println);
        future.get();*/

    }
}
