package oops;

abstract class Car{//abstract class can have abstract methods and non-abstract methods ,it is used in scenario where want to create a class which is not complete and we want to complete it in child class.and the child class must implement the abstract methods of parent class.
    public abstract void drive();//this is abstract method which is declared but not defined, it is defined in child class.to declare a method as abstract we need to use abstract keyword and the class which contains abstract method must be declared as abstract class.
    
    public void playMusic(){
        System.out.println("Music is playing");   
    }
}
class BMW extends Car{//concrete class which is child class of abstract class Car and it is implementing the abstract method of parent class.
    public void drive(){//this is the implementation of abstract method of parent class.if we dont implement it we will get compile time error.
        System.out.println("BMW is driving");
    }
}


public class AbstractKeyword {
    public static void main(String[] args) {
        
        //Abstract class cannot be instantiated.we need to create object of child class to access the methods of abstract class or we can use reference of abstract class to access the methods of child class.(dynamic method dispatch)

        Car obj=new BMW();
        obj.drive();
        obj.playMusic();
    }
}
