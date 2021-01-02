package koys.java8to11.CompletableFuture;

import java.util.concurrent.*;

public class CompletableFutureApp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*CompletableFuture<Object> future = new CompletableFuture<>();
        future.complete("ko");
        System.out.println(future.get());*/

        /*CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            return "Hello";
        }).thenApply((s) -> {
            System.out.println(Thread.currentThread().getName());
            return s.toUpperCase();
        });*/

        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            return "Hello";
        }).thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        System.out.println(future.get());



    }
}
