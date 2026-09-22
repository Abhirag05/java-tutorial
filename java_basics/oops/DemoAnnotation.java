package oops;
//annotation: annotation is a metadata that provides data about a program but is not part of the program itself. Annotations have no direct effect on the operation of the code they annotate. Annotations can be read from source files, class files, or reflectively at run time. Annotations can be used by the compiler to detect errors or suppress warnings. Annotations can be used by development tools to generate code, XML files, and so forth.
class A{
    public void display(){
        System.out.println("This is class A");
    }

}

class B extends A{
    //.So if we put the annotation here and then if the methods name changed to display2, the compiler will generate an error because the method display2 is not overriding any method in the superclass. So we can say that the annotation @Override is used to indicate that a method is intended to override a method in a superclass. If the method does not actually override a method in the superclass, the compiler will generate an error.
    
    @Override
    public void display(){
        System.out.println("This is class B");
    }
}
public class DemoAnnotation {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
