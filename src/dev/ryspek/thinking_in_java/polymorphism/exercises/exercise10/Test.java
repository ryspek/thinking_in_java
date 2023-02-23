package dev.ryspek.thinking_in_java.polymorphism.exercises.exercise10;

/*
    Exercise 10: (3) Create a base class with two methods. In the first method, call the
second method. Inherit a class and override the second method. Create an object of the
derived class, upcast it to the base type, and call the first method. Explain what happens.
*/

public class Test {

    public static void main(String[] args) {

        Derived der = new Derived();

        Base b = der;

        b.first();

    }

}
