package oops;

class Human{
    String name;
    int age;
    public Human(){ //default constructor (actually done by java default no need for mention)
        name="Abhi";
        age=30;
    }
    public Human(String name,int age){ //parametarized constructor
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name:"+name + "Age:"+age);
    }
}

public class DemoConstructor {
    public static void main(String[] args) {
        Human h=new Human();
        h.display();
        
        Human h1=new Human("Zoro",20);
        h1.display();
        
    }
}

