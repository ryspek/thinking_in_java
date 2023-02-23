package dev.ryspek.thinking_in_java.concurrency.basic_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Shows use of thread priorities.
public class SimplePriorities implements Runnable {

    private int countDown = 5;
    private volatile double d; // No optimization
    private int priority;

    public SimplePriorities(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true) {
            // An expensive, interruptable operation:
            for (int i = 1; i < 100_000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 100 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
            exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        exec.shutdown();
    }
}
