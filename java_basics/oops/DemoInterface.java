package oops;

interface A{//an interface is a collection of abstract methods and constants. It is used to achieve abstraction and multiple inheritance in java.
    int age=10;//by default it is public, static and final. We cannot change the value of age because it is final. It is created in the method area of the memory and it is shared by all the objects of the class. It is dependent on the class.
    void display();//by default it is public and abstract. We cannot create object of interface because it is abstract. It is created in the method area of the memory and it is shared by all the objects of the class. It is dependent on the class.
}
interface C{
    void show();
}
interface D extends A,C{//an interface can extend multiple interfaces. It is used to achieve multiple inheritance in java. It is created in the method area of the memory and it is shared by all the objects of the class. It is dependent on the class.
    void run();
}
class B implements A, C,D{//a class can implement multiple interfaces. It is used to achieve multiple inheritance in java. It is created in the heap memory and it is not shared by all the objects of the class. It is dependent on the object of the class.
    public void display(){//we have to provide implementation for all the abstract methods of the interface. We cannot change the access modifier of the method because it is public in the interface. We cannot change the return type of the method because it is void in the interface. We cannot change the name of the method because it is display in the interface. We cannot change the parameters of the method because it is empty in the interface.
        System.out.println("This is class B");
    }
    public void show(){
        System.out.println("This is class C");
    }
    public void run(){
        System.out.println("This is class D");
    }
}
public class DemoInterface {
    public static void main(String[] args) {
        B obj=new B();
        obj.display();
        System.out.println("Age: "+A.age);
        obj.show();
        obj.run();
    }
}
