package dev.ryspek.thinking_in_java.polymorphism.thetwist.extensibility;

import dev.ryspek.thinking_in_java.polymorphism.upcastingrevisited.Note;

public class Guitar extends Instrument {

    void play(Note n) {
        System.out.println("Guitar.play() " + n);
    }

    String what() {
        return "Guitar";
    }

    void adjust() {
        System.out.println("Adjusting Guitar");
    }

}
