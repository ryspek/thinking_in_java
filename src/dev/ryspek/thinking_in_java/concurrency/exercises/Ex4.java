package dev.ryspek.thinking_in_java.concurrency.exercises;

import dev.ryspek.thinking_in_java.concurrency.exercises.Ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex4 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 3; i++) {
            exec.execute(new Ex2(18));
        }
        System.out.println("All tasks are finished.");
    }
}
