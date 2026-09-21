package oops;
class A{
    public void display(){
        System.out.println("This is class A");
    }

}
public class AnonymousClass {
    public static void main(String[] args) {
        //anonymous class: anonymous class is a class which has no name and it is defined and instantiated in a single statement. It is used to override the method of a class or interface. It is used when we want to create a class which is not complete and we want to complete it in child class or if we dont want to create a separate class for a single use case. It is created in the heap memory and it is not shared by all the objects of the class. It is dependent on the object of outer class.

        A obj=new A(){
            public void display(){
                System.out.println("This is anonymous class");
            }
        };
        A obj1=new A();
        obj1.display();
        obj.display();
    }
}