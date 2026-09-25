package oops;

import java.util.List;
import java.util.stream.Stream;
//streams are used to process collections of objects. A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels. Streams don’t change the original data structure, they only provide the result as per the pipelined methods.

//with the help of streams, we can process data in a declarative way (similar to SQL statements). It makes our code more readable and concise. Streams are designed to work with Java Collections. The stream() method is defined in the Collection interface, which is the root interface of the Java Collections framework. The stream() method returns a sequential Stream with this collection as its source.
//what makes stream different from the list is that stream provides built in mehtods liike filter, map, reduce, collect, forEach etc. which can be used to process the data in a more functional way. Streams are designed to be used in a single pass, meaning that once a stream has been consumed, it cannot be reused. This is because streams are designed to be lazy and only compute the result when it is needed. Once a terminal operation is performed on a stream, it is considered consumed and cannot be reused. If you try to reuse a stream after it has been consumed, you will get an IllegalStateException.
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.forEach(n->System.out.println(n));
        numbers.forEach(n->System.out.println(n));
        
        System.out.println("Using Streams s1:");

        Stream <Integer> s1 = numbers.stream();
       // s1.forEach(n->System.out.println(n));
        //s1.forEach(n->System.out.println(n)); this will throw an exception because s1 can be used only once. After the terminal operation is performed, the stream is closed and cannot be reused.

        System.out.println("Using Streams s2:");
        //Stream <Integer> s2 = numbers.stream().filter(n->n%2==0);//if we again want to use the stream, we need to create a new stream object.
        Stream <Integer> s2 = s1.map(n->n*2);//if this need to work we do not need to create a new stream object. We can use the existing stream object and apply the intermediate operation on it.but make sure that the s1 is not used before this line. If it is used before this line, it will throw an exception because s1 can be used only once.
        s2.forEach(n->System.out.println(n));

        //real use case: we are creating a stream of numbers, filtering out the even numbers, multiplying them by 2 and then reducing them to a single value by adding them up.we can also achieve this by list but it will be more verbose and less readable. Streams provide a more functional approach to processing data, making it easier to read and understand.
        int result=numbers.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);
        System.out.println("Result: "+result);
       
    }
}