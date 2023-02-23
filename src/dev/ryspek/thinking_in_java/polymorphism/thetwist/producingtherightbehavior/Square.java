package dev.ryspek.thinking_in_java.polymorphism.thetwist.producingtherightbehavior;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void roll() {
        System.out.println("Square.roll()");
    }

}
