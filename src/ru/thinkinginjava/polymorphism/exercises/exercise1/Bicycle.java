package ru.thinkinginjava.polymorphism.exercises.exercise1;

public class Bicycle extends Cycle {

    @Override
    public void move() {
        System.out.println("Bicycle.move()");
    }

    @Override
    public void wheels() {
        System.out.println("Bicycle.wheeles(): 2 wheels");
    }

}
