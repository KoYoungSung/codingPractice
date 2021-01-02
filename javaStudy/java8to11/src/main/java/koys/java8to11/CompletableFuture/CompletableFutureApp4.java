package koys.java8to11.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureApp4 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        boolean throwError = true;

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            if (throwError) {
                throw new IllegalArgumentException();
            }
            System.out.println("hello" + Thread.currentThread().getName());
            return "hi";
        })/*exceptionally(ex -> {
            System.out.println(ex);
            return "Error!";
        });*/
                .handle((result, ex) -> {
                    if (ex != null) {
                        System.out.println(ex + "error");
                    }
                    return result;
                });
        System.out.println(future.get());
    }
}
