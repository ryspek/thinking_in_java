package dev.ryspek.thinking_in_java.polymorphism.thetwist.extensibility;

import java.util.Random;

public class RandomInstrumentGenerator {

    private Random rand = new Random(47);

    public Instrument next() {
        switch(rand.nextInt(7)) {
            default:
            case 0: return new Brass();
            case 1: return new Guitar();
            case 2: return new Percussion();
            case 3: return new Stringed();
            case 4: return new Wind();
            case 5: return new Woodwind();
        }
    }

}
