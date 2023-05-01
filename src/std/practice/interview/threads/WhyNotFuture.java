package std.practice.interview.threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WhyNotFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.execute(() -> {
            System.out.println("Printing from execute method");
        });

        Future<List<Integer>> future = executorService.submit(() -> {
            System.out.println("Printing from submit method");
            return Arrays.asList(1,2,5,8,3,9,4,7,6);
        });

        List<Integer> lst = future.get();

        System.out.println(lst);
    }
}
