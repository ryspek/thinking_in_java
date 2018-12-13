package ru.thinkinginjava.polymorphism.thetwist.producingtherightbehavior;

public class Shapes {

    // Exercise 2: Add the @Override annotation to the shapes example.

    /* Exercise 3: Add a new method in the base class of Shapes.java that prints a message,
        but don't override it in the derived classes. Explain what happens. Now override it
        in one of the derived classes but not the others, and see what happens. Finally, override it in
        all the derived classes. */

    /* Exercise 4: Add a new type of Shape to Shapes.java and verify in main() that
        polymorphism works for your new type as it does in the old types. */

    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[12];

        // Fill up teh array with shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();

        // Make polymorphic method calls:
        for(Shape shp : s) {
            shp.draw();
            shp.roll();
        }
    }

}
