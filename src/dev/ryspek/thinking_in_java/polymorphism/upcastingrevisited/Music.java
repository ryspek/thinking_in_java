package dev.ryspek.thinking_in_java.polymorphism.upcastingrevisited;

public class Music {

    public static void tune(Instrument i) {

        i.play(Note.MIDDLE_C);

    }

    public static void main(String[] args) {

        Wind flute = new Wind();
        tune(flute); // upcasting

    }

}
