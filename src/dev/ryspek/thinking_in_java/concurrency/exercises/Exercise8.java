package dev.ryspek.thinking_in_java.concurrency.exercises;

import dev.ryspek.thinking_in_java.concurrency.basic_threading.LiftOff;

import java.util.concurrent.TimeUnit;

public class Exercise8 {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new LiftOff());
            t.setDaemon(true);
            t.start();
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Waiting for LiftOff");
    }
}
