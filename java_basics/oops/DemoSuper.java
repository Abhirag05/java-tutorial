package oops;
//in java in every constructor contains the super() method which calls the constructor of parent class. If we do not write the super() method in the constructor then also it will be called by default. The super() method should be the first statement in the constructor. If we want to call the parameterized constructor of parent class then we can use super(parameter) method in the constructor of child class.

//every class in java extends the Object class by default. So if we do not write the super() method in the constructor then also it will be called by default. 

class A extends Object{
    public A(){
        System.out.println("Constructor of A");//calls this constructor of A class when object of B class is created because B class is child class of A class and constructor of parent class is always called first when object of child class is created.
    }
    public A(int n){
        System.out.println("Constructor of A with parameter:"+n);
    }
}
class B extends A{
    public B(){
       // super(1);
        System.out.println("Constructor of B");
    }
    public B(int n){
        this();//this() methods calls the constructor of the same class unlike super() method which calls the constructor of parent class. The this() method should be the first statement in the constructor. If we want to call the parameterized constructor of same class then we can use this(parameter) method in the constructor of same class.

        //super(n);//calls the constructor of A class with parameter n
        System.out.println("Constructor of B with parameter:"+n);
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        //B b=new B();
       // B b2=new B(5);
       //B b3=new B();
       B b4=new B(10);
    }
}
