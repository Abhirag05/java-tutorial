package oops;
//exception is the parent class of all the exceptions in java. An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. It is an object that represents an error or an unexpected condition that occurs during the execution of a program. When an exception occurs, the normal flow of the program is interrupted, and the program may terminate abnormally if the exception is not handled properly. In Java, exceptions are represented by classes that extend the Throwable class. There are two main types of exceptions in Java: checked exceptions and unchecked exceptions. Checked exceptions are exceptions that are checked at compile-time, while unchecked exceptions are exceptions that are not checked at compile-time.
public class DemoException {
    public static void main(String[] args) {
        int nums[]=new int[5];
        int a=10;
        int b=0;
        try{   
            int c=a/b;
            nums[10]=100;
            System.out.println("Result:"+c);
        }catch(ArithmeticException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception caught: "+e.getMessage());
        }
        finally{
            System.out.println("This block will always execute");
        }
    }
}
