package dev.ryspek.thinking_in_java.polymorphism.upcastingrevisited;

public class Brass extends Instrument {

    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

}
