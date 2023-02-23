package dev.ryspek.thinking_in_java.polymorphism.thetwist.extensibility;

import dev.ryspek.thinking_in_java.polymorphism.upcastingrevisited.Note;

public class Stringed extends Instrument {

    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }

}
