package oops;
class Calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
}

public class DemoClass {
    public static void main(String[] args) {
        Calc calc=new Calc();//object creation:it is created by jvm when we pass the actual blue print which is the class Calc.'calc' is the reference variable that holds the address of the object.the new creates the object in the heap memory and stores the refeerence in the calc variable.
        int result=calc.add(1,2);
        System.out.println(result);
    }
}
