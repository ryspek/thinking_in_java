package ru.thinkinginjava.polymorphism.thetwist.producingtherightbehavior;

public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void roll() {
        System.out.println("Triangle.roll()");
    }

}
