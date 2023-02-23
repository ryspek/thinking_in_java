package dev.ryspek.thinking_in_java.concurrency.exercises;

public class Ex2Test {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Ex2(18));
            thread.start();
        }
        System.out.println("All tasks are finished.");
    }
}
