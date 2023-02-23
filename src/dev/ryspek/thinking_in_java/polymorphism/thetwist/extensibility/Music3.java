package dev.ryspek.thinking_in_java.polymorphism.thetwist.extensibility;

import dev.ryspek.thinking_in_java.polymorphism.upcastingrevisited.Note;

public class Music3 {

    /*
    Exercise 6: (1) Change Music3.java so that what( ) becomes the root Object method
        toString( ). Try printing the Instrument objects using System.out.println( ) (without
        any casting).
    Exercise 7: (2) Add a new type of Instrument to Music3.java and verify that
        polymorphism works for your new type.
    Exercise 8: (2) Modify Music3.java so that it randomly creates Instrument objects
        the way Shapes.java does
    */

    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }

    private static RandomInstrumentGenerator generator = new RandomInstrumentGenerator();

    public static void main(String[] args) {

        Instrument[] inst = new Instrument[21];

        for(int i = 0; i < inst.length; i++)
            inst[i] = generator.next();

        for(Instrument i : inst) {
            i.play(Note.B_FLAT);
            i.what();
        }

        // Upcasting during addition to the array:
        Instrument[] orchestra = {
          new Wind(),
          new Percussion(),
          new Stringed(),
          new Brass(),
          new Woodwind(),
          new Guitar()
        };

        // tuneAll(orchestra);
    }

}
