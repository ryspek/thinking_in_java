package ru.thinkinginjava.polymorphism.thetwist.extensibility;

import ru.thinkinginjava.polymorphism.upcastingrevisited.Note;

public class Woodwind extends Wind {

    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    String what() {
        return "Woodwind";
    }

}
