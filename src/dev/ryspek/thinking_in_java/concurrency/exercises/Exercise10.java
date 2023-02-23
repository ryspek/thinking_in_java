package dev.ryspek.thinking_in_java.concurrency.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Exercise10 implements Callable<Integer> {

    ExecutorService exec = Executors.newSingleThreadExecutor();

    private Integer n = 0;

    private int fib(int num) {
        if (num < 2) return 1;
        return fib(num - 2) + fib( num - 1);
    }

    @Override
    public Integer call() throws Exception {
        Integer sum = 0;
        for (int i = 0; i < n; i++) {
            sum += fib(i);
        }
        return sum;
    }

    public Future<Integer> runTask(Integer n) {
        this.n = n;
        return exec.submit(this);

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Exercise10 exercise10 = new Exercise10();

        try {
            for (int i = 0; i < 10; i++)
                System.out.print("Current sum is: " + exercise10.runTask(i).get() + ", ");
        } catch (InterruptedException e) {
            System.out.println(e);
            return;
        } catch (ExecutionException e) {
            System.out.println(e);
        } finally {
            exercise10.exec.shutdown();
        }
    }

}
