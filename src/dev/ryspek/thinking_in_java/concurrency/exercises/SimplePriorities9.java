package dev.ryspek.thinking_in_java.concurrency.exercises;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class SimplePriorities9ThreadFactory implements ThreadFactory {

    Random random = new Random();
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        int num = random.nextInt(3);
        switch (num) {
            case 0: t.setPriority(Thread.MIN_PRIORITY); break;
            case 1: t.setPriority(Thread.NORM_PRIORITY); break;
            case 2: t.setPriority(Thread.MAX_PRIORITY); break;
            default:
        }
        return t;
    }
}

// Shows use of thread priorities.
public class SimplePriorities9 implements Runnable {

    private int countDown = 5;
    private volatile double d; // No optimization

    @Override
    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }

    @Override
    public void run() {
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
        ExecutorService exec = Executors.newCachedThreadPool(new SimplePriorities9ThreadFactory());
        for (int i = 0; i < 5; i++)
            exec.execute(new SimplePriorities9());
        exec.shutdown();
    }
}
