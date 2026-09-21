package oops;

class A{
    public void show(){
        System.out.println("This is outer class");
    }

    class B{
        public void display(){
            System.out.println("This is inner class");
        }
    }
    static class C{//we can use static keyword to make the inner class static. It is not dependent on the object of outer class. It is created in the method area of the memory and it is shared by all the objects of the class. We can create object of static inner class without creating object of outer class because it is not dependent on the object of outer class.
        public void display(){
            System.out.println("This is static inner class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        
        A obj=new A();
        obj.show();

        A.B obj1=obj.new B();//we can create object of inner class using the object of outer class. We cannot create object of inner class without creating object of outer class because inner class is dependent on outer class. It is created in the heap memory and it is not shared by all the objects of the class. It is dependent on the object of outer class.
        obj1.display();

        A.C obj2=new A.C();//we can create object of static inner class without creating object of outer class.
        obj2.display();
    }
}
