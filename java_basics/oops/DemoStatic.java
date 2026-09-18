package oops;

class Mobile{
    String brand;
    static String name="Smart Phone";//we can use static keyword to make the variable common for all the objects of the class. It is not dependent on the object. It is dependent on the class. It is created in the method area of the memory and it is shared by all the objects of the class.
    int price;

    public void show(){
        System.out.println("brand:"+brand+"name:"+name+ "price:"+price);
    }
    public static void display(){
        System.out.println("name:"+name);//we can only use static variables inside the static method. We cannot use non-static variables inside the static method because the static method is not dependent on the object and it is created in the method area of the memory and it is shared by all the objects of the class. The non-static variables are dependent on the object and they are created in the heap memory and they are not shared by all the objects of the class.
    }
}

public class DemoStatic {
    public static void main(String[] args) {//static void main(String[] args) is the entry point of the program. It is a static method because it is called by the JVM without creating an object of the class. It is created in the method area of the memory and it is shared by all the objects of the class.
        Mobile m=new Mobile();
        m.brand="apple";
        m.price=123;

        Mobile m1=new Mobile();
        m1.brand="samsung";
        m1.price=190;

        m.show();
        m1.show();

        Mobile.display();//we can call the static method using the class name. It is not dependent on the object. It is dependent on the class. It is created in the method area of the memory and it is shared by all the objects of the class.
    }
}
