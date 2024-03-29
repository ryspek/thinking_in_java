package dev.ryspek.thinking_in_java.concurrency.basic_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SettingDefaultHandler {

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread());
    }
}
