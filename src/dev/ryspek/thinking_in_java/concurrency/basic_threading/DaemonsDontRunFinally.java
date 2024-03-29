package dev.ryspek.thinking_in_java.concurrency.basic_threading;

// Daemon threads don't run the finally clause

import java.util.concurrent.TimeUnit;

class ADaemon implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedException");
        } finally {
            System.out.println("This should always run?");
        }
    }
}

public class DaemonsDontRunFinally {

    public static void main(String[] args) {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
    }
}
