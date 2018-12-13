package ru.thinkinginjava.polymorphism.thetwist.producingtherightbehavior;

public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle.erase()");
    }

    @Override
    public void roll() {
        System.out.println("Rectangle.roll()");
    }
}
