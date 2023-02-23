package dev.ryspek.thinking_in_java.concurrency.basic_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// {ThrowsException}
public class ExceptionThread implements Runnable {

    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread());
    }
}
