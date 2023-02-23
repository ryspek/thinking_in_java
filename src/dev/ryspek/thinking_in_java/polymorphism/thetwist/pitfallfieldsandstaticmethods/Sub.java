package dev.ryspek.thinking_in_java.polymorphism.thetwist.pitfallfieldsandstaticmethods;

class Sub extends Super {

    public  int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }

}
