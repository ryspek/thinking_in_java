package dev.ryspek.thinking_in_java.concurrency.basic_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// {ThrowsException}
public class NaiveExceptionHandling {

    public static void main(String[] args) {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            exec.execute(new ExceptionThread());
        } catch (RuntimeException ue) {
            // This statement will NOT execute!
            System.out.println("Exception has been handled!");
        }
    }
}
