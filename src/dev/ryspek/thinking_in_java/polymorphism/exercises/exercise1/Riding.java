package dev.ryspek.thinking_in_java.polymorphism.exercises.exercise1;

/*
    Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which
        returns the number of wheels. Modify ride( ) to call wheels( ) and verify that
        polymorphism works.
*/

public class Riding {

    public static void ride(Cycle c) {
        c.move();
        c.wheels();
    }


    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        Unicycle u = new Unicycle();

        b.move();
        t.move();
        u.move();

        ride(b);
        ride(t);
        ride(u);
    }

}
