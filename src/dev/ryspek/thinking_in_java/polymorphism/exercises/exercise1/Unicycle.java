package dev.ryspek.thinking_in_java.polymorphism.exercises.exercise1;

public class Unicycle extends Cycle {

    @Override
    public void move() {
        System.out.println("Unicycle.move()");
    }

    @Override
    public void wheels() {
        System.out.println("Unicycle.wheeles(): 1 wheel");
    }

}
