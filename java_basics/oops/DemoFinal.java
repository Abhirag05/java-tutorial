package oops;

//final keyword: the final keyword is used to restrict the user. The final keyword can be used in many context. 1) final variable 2) final method 3) final class

final class Calc{//making a class final means that the class cannot be inherited by any other class. It is used to prevent inheritance and to ensure that the class cannot be subclassed. A final class can have final methods, but it cannot have any subclasses. A final class can be instantiated, but it cannot be extended.
    final public void show(){//making a method final means that the method cannot be overridden by any subclass. It is used to prevent method overriding and to ensure that the method cannot be modified by any subclass. A final method can be inherited by a subclass, but it cannot be overridden by the subclass.
        System.out.println("This is class A");
    }
    public void add(int a,int b){
        System.out.println("The sum of a and b is:"+(a+b));
    }
}

public class DemoFinal {
    public static void main(String[] args) {
        //final variable: a final variable can only be initialized once. Once a final variable is assigned, it always contains the same value. If we try to reassign a final variable, we will get a compile-time error.
        final int x=10;
        //x=20; //this will give an error because x is a final variable and cannot be reassigned.
        System.out.println("Value of x:"+x);

        Calc c=new Calc();
        c.show();
        c.add(10,20);
    }
}
