package koys.java8to11.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureApp3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            return "Hello";
        });

        CompletableFuture<String> future = hello.thenCompose(CompletableFutureApp3::getWorld);
        System.out.println(future);
    }

    private static CompletableFuture<String> getWorld(String message) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("world" + Thread.currentThread().getName());
            return message +"world";
        });
    }
}
