//polymorphism: polymorphism is the ability of an object to take on many forms. It allows us to perform a single action in different ways. In java, polymorphism is mainly divided into two types: 1) compile time polymorphism 2) runtime polymorphism.

//compile time polymorphism: compile time polymorphism is also known as static polymorphism. It is achieved by method overloading and operator overloading. In method overloading, we can have multiple methods with the same name but different parameters. In operator overloading, we can have multiple operators with the same name but different parameters.

//runtime polymorphism: runtime polymorphism is also known as dynamic polymorphism. It is achieved by method overriding. In method overriding, we can have a subclass that provides a specific implementation of a method that is already defined in its superclass. The method in the subclass should have the same name, return type and parameters as the method in the superclass.
package oops;

class A{
    public void display(){
        System.out.println("This is class A");
    }

}
class B extends A{
    public void display(){
        System.out.println("This is class B");
    }

}
class C extends B{
    public void display(){
        System.out.println("This is class C");
    }
    public void show(){
        System.out.println("This is class C");
    }

}

public class DemoPolymorphism {
    public static void main(String[] args) {
       //dynamic method dispatch: dynamic method dispatch is a mechanism by which a call to an overridden method is resolved at runtime rather than compile-time. It is achieved by using a reference variable of the superclass to refer to an object of the subclass. The method that is called is determined by the actual object that the reference variable refers to at runtime.
        
       //the use of dynamic method dispatch allows us to achieve runtime polymorphism in java. It allows us to write more flexible and reusable code by allowing us to use a single reference variable to refer to objects of different classes that are related by inheritance.

       //for example consider if we have an payment system where we have a superclass called Payment and subclasses called CreditCardPayment, DebitCardPayment and NetBankingPayment. We can use a reference variable of the superclass Payment to refer to objects of the subclasses CreditCardPayment, DebitCardPayment and NetBankingPayment. The method that is called is determined by the actual object that the reference variable refers to at runtime.by that we can reuse the same code for different types of payments without having to write separate code for each type of payment.

        A obj;

        obj=new A();
        obj.display();

        obj=new B();
        obj.display();
        
        obj=new C();
        C cobj=(C)obj; //downcasting: downcasting is the process of converting a reference variable of a superclass type to a reference variable of a subclass type. It is done by using the cast operator (). Downcasting is required when we want to access the methods of the subclass that are not present in the superclass. In this case, we need to downcast the reference variable of the superclass to the reference variable of the subclass in order to access the methods of the subclass.
        cobj.show();
        obj.display();
    }
    
}
