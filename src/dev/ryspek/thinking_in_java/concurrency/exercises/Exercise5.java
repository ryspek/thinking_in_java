package dev.ryspek.thinking_in_java.concurrency.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Exercise5 implements Callable<Integer> {

    private int n;
    private int count = 0;

    public Exercise5(int n) {
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
    public Integer call() throws Exception {
        Integer sum = 0;
        for (int i = 0; i < n; i++) {
            sum += this.next();
        }
        return sum;
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<Integer>> results = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            results.add(exec.submit(new Exercise5(18)));

        for (Future<Integer> fs : results)
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
            } finally {
                exec.shutdown();
            }
    }

}
