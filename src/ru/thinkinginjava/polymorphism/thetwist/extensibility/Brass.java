package ru.thinkinginjava.polymorphism.thetwist.extensibility;

import ru.thinkinginjava.polymorphism.upcastingrevisited.Note;

public class Brass extends Wind {

    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }

}
