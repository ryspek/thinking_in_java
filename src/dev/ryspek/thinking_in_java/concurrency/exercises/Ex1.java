package dev.ryspek.thinking_in_java.concurrency.exercises;

public class Ex1 implements Runnable {

    public Ex1() {
        System.out.println("Initializing a constructor");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
            Thread.yield();
        }
        System.out.println("The task is terminated");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Ex1()).start();
        }
        System.out.println("Waiting for Ex1");
    }

}
