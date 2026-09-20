package oops;

//So basically encapsulation is the process of wrapping the data members and methods together as a single unit. In encapsulation,we can make the variables and methods of a class  be hidden from other classes through access modifiers,Therefore, it is also known as data hiding.But it can be achieved by making the variables private and providing public methods to access them.

//this:is a current word whic refers the current object which is currently calling.it removes the overhead of passing the calling object as the local variable (java handles internally).with the help of this keyword we can differentiate between instance variable and local variable. with help of this we cna use the same instance variable name as the local variable to make it more readable or removing the use of unwanted namings.

//access modifiers: access modifiers are keywords which are used to set the accessibility of classes,methods and other members. There are four types of access modifiers in java: 1)public 2)private 3)protected 4)default

//public: the public access modifier is used to set the accessibility of classes,methods and other members to be accessible from any other class in any package.
//private: the private access modifier is used to set the accessibility of classes,methods and other members to be accessible only within the class in which it is declared.

//protected: the protected access modifier is used to set the accessibility of classes,methods and other members to be accessible within the same package and also by subclasses in other packages.

//default: the default access modifier is used to set the accessibility of classes,methods and other members to be accessible only within the same package. It is also known as package-private access modifier.

class Human{
    private int age=20;//instance variable
    private String name;
    private long phone;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setPhone(long p/*local variable*/){
        phone=p;
    }
    public long getPhone(){
        return phone;
    }
}


public class DemoEncapsulation {
    public static void main(String[] args) {
        Human h=new Human();
        
        h.setName("Abhirag");
       
        System.out.println("Name:"+h.getName()+"Age:"+h.getAge());

       h.setPhone(389393823);

       System.out.println("Phone number:"+h.getPhone());
       
    }
}
