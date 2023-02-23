package dev.ryspek.thinking_in_java.polymorphism.upcastingrevisited;

public class Stringed extends Instrument {

    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

}
