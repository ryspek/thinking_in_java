package dev.ryspek.thinking_in_java.concurrency.exercises;

public class Ex2 implements Runnable {

    private int n;
    private int count = 0;

    public Ex2(int n) {
        this.n = n;
    }

    public Integer next() {
        return fib(count++);
    }

    private int fib(int num) {
        if (num < 2) return 1;
        return fib(num - 2) + fib( num - 1);
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.print(this.next() + " ");
        }
    }
}
