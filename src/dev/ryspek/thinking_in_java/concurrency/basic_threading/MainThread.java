package dev.ryspek.thinking_in_java.concurrency.basic_threading;

public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
