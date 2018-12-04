package ru.thinkinginjava.polymorphism.exercises.exercise1;

public class Riding {

    public static void ride(Cycle c) {
        c.move();
    }


    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        Unicycle u = new Unicycle();

        b.move();
        t.move();
        u.move();
    }

}
