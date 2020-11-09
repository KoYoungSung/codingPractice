package koys.java8to11.CompletableFuture.Thread;

public class InterruptThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
//
//            try {
//                Thread.sleep(1000L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        while(true){
            System.out.println("Thread:" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println("exit");
                return;
            }
        }

        });
        thread.start();
        System.out.println("Hello" + Thread.currentThread().getName());
        Thread.sleep(3000L);
        thread.interrupt();
    }
}

