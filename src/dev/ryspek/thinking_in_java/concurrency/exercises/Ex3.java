package dev.ryspek.thinking_in_java.concurrency.exercises;

import dev.ryspek.thinking_in_java.concurrency.exercises.Ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex3 {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Ex1());
        }
        exec.shutdown();
        System.out.println("Waiting for Ex1");
    }
}
