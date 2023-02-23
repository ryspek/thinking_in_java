package dev.ryspek.thinking_in_java.concurrency.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex6 implements Runnable {

    @Override
    public void run() {
        try {
            long sleepTimeSum = 0;
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread " + Thread.currentThread().getId() + " is running");
                TimeUnit.SECONDS.sleep(1);
                sleepTimeSum++;
            }
            System.out.println("The total sleep time is: " + sleepTimeSum);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new Ex6());
        exec.shutdown();
    }
}
