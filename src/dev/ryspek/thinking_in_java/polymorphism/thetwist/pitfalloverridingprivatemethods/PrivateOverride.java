package dev.ryspek.thinking_in_java.polymorphism.thetwist.pitfalloverridingprivatemethods;

public class PrivateOverride {

    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }

}
