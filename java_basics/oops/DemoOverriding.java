package oops;

//methiod overriding is a feature of object oriented programming which allows a subclass to provide a specific implementation of a method that is already defined in its superclass. When a method in a subclass has the same name, return type, and parameters as a method in its superclass, the subclass method overrides the superclass method. This allows for dynamic polymorphism, where the method that gets executed is determined at runtime based on the actual object type.
class A {
    public void display(){
        System.out.println("Display method of A class");
    }
}

class B extends A {
    public void display(){
        System.out.println("Display method of B class");
    }
}

public class DemoOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.display();
        b.display();
    }
}
