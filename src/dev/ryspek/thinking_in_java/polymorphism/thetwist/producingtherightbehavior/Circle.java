package dev.ryspek.thinking_in_java.polymorphism.thetwist.producingtherightbehavior;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void roll() {
        System.out.println("Circle.roll()");
    }

}
