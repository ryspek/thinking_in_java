package ru.thinkinginjava.polymorphism.upcastingrevisited;

public class Stringed extends Instrument {

    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

}
