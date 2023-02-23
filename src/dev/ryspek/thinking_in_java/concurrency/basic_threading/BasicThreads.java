package dev.ryspek.thinking_in_java.concurrency.basic_threading;

// The most basic use of the Thread class.
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
