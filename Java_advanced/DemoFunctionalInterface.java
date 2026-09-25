package oops;

@FunctionalInterface //a function interface is an interface that has just one abstract method. It can have multiple default or static methods. Functional interfaces are used as the basis for lambda expressions and method references in Java. The @FunctionalInterface annotation is used to indicate that an interface is intended to be a functional interface. If an interface annotated with @FunctionalInterface has more than one abstract method, the compiler will generate an error.
interface A{
    void show();
}

public class DemoFunctionalInterface {
    public static void main(String[] args) {
        A a = () -> System.out.println("This is a functional interface");//here we are using a lambda expression to provide an implementation for the show() method of the functional interface A. The lambda expression () -> System.out.println("This is a functional interface") defines the behavior of the show() method, which simply prints a message to the console. We then call the show() method on the instance of A, which executes the lambda expression and prints the message.we are using this to avoid creating a separate class that implements the interface A and provides an implementation for the show() method. Instead, we can use a lambda expression to provide the implementation inline, making the code more concise and easier to read.
        a.show();
    }
}
