package dev.ryspek.thinking_in_java.polymorphism.upcastingrevisited;

public class Wind extends Instrument {

    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

}
