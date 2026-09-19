package oops;
//in java muliple inheritance is not possible but we can achieve it through interfaces.The reason behind this is that if we have multiple inheritance then there will be ambiguity in the methods of the parent classes. so to avoid this java does not support multiple inheritance. In java we can have single level inheritance, multilevel inheritance and hierarchical inheritance.
class Calc{
    public int add(int n1 ,int n2){
        return n1+n2;
    }
}

class AdvancedCalc extends Calc{//single level inheritance
    public int modulo(int n1,int n2){
        return n1%n2;
    }
}
class VeryAdvancedCalc extends AdvancedCalc{//multilevel inheritance
    public int multiply(int n1,int n2){
        return n1*n2;
    }
}

public class DemoInheritance {
    public static void main(String[] args) {
        
        VeryAdvancedCalc c=new VeryAdvancedCalc();
        
        int r1=c.add(1,3);
        System.out.println("Sum from Calc class:"+r1);
        
        int r2=c.modulo(6,2);
        System.out.println("Modulo from AdvancedCalc class:"+r2);

        int r3=c.multiply(4,5);
        System.out.println("Product from VeryAdvancedCalc class:"+r3);

    }
}
