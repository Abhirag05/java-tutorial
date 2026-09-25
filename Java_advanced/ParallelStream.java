package oops;

import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        // Parallel streams are similar to regular streams, but they use multiple threads to process the data in parallel.
        // This can lead to better performance when dealing with large datasets.

        Random random = new Random();
        List<Integer> numbers = random.ints(1, 100).limit(1000000).boxed().toList(); 
    
        long startTime = System.currentTimeMillis();
        System.out.println("Using Parallel Streams:");//so the reason why we use parallel streams is that they can take advantage of multiple cores in a CPU, which can lead to better performance when processing large datasets. However, it's important to note that not all operations can be parallelized effectively, and in some cases, using parallel streams can actually lead to worse performance due to the overhead of managing multiple threads. Therefore, it's important to carefully consider whether parallel streams are appropriate for a given use case.it creates and manages multiple threads behind the scenes reducing the complexity of multithreading for the developer. 
        int parallelResult = numbers.parallelStream()
                .map(n -> n * 2)
                .mapToInt(i-> i)
                .sum();
        long endTime = System.currentTimeMillis();
        System.out.println("Result: " + parallelResult);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");

        System.out.println("Using Sequential Streams:");
       
        long sequentialStartTime = System.currentTimeMillis();
        int sequentialResult = numbers.stream()
                .map(n -> n * 2)
                .mapToInt(i-> i)
                .sum();
        
                long sequentialEndTime = System.currentTimeMillis();
        System.out.println("Result: " + sequentialResult);
        System.out.println("Time taken: " + (sequentialEndTime - sequentialStartTime) + " ms");
    }
}
