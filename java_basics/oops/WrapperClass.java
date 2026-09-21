package oops;
//wrapper class is used to convert primitive data type into object and object into primitive data type
public class WrapperClass {
    public static void main(String[] args) {
        int a=10;
        Integer i=Integer.valueOf(a); //converting int into Integer explicitly
        Integer j=a; //autoboxing, now compiler will write Integer.valueOf(a) internally
        
        System.out.println(a+" "+i+" "+j);
        
        Integer x=new Integer(3);
        int y=x.intValue(); //converting Integer to int explicitly
        int z=x; //autounboxing, now compiler will write x.intValue() internally
        
        System.out.println(x+" "+y+" "+z);
    }
}
