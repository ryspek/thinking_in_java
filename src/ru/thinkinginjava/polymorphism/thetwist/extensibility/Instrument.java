package ru.thinkinginjava.polymorphism.thetwist.extensibility;

import ru.thinkinginjava.polymorphism.upcastingrevisited.Note;

public class Instrument {

    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }

}
