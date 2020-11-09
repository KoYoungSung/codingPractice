package koys.java8to11.CompletableFuture.Thread;

public class BasicThread {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("Hello");
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("Thread: = " + Thread.currentThread().getName());

        }
    }


}
