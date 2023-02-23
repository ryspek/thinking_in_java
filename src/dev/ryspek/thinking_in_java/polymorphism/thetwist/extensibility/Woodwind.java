package dev.ryspek.thinking_in_java.polymorphism.thetwist.extensibility;

import dev.ryspek.thinking_in_java.polymorphism.upcastingrevisited.Note;

public class Woodwind extends Wind {

    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    String what() {
        return "Woodwind";
    }

}
