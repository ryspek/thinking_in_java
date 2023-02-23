package dev.ryspek.thinking_in_java.polymorphism.thetwist.producingtherightbehavior;

import java.util.Random;

// A "factory" that randomly creates shapes.
public class RandomShapeGenerator {

    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rectangle();
        }
    }
}
