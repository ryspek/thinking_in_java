package dev.ryspek.thinking_in_java.polymorphism.thetwist.extensibility;

import dev.ryspek.thinking_in_java.polymorphism.upcastingrevisited.Note;

public class Percussion extends Instrument {

    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
