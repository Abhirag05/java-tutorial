package oops;

import java.util.Scanner;

//exception is the parent class of all the exceptions in java. An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. It is an object that represents an error or an unexpected condition that occurs during the execution of a program. When an exception occurs, the normal flow of the program is interrupted, and the program may terminate abnormally if the exception is not handled properly. In Java, exceptions are represented by classes that extend the Throwable class. There are two main types of exceptions in Java: checked exceptions and unchecked exceptions. Checked exceptions are exceptions that are checked at compile-time, while unchecked exceptions are exceptions that are not checked at compile-time.
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
class DemoThrowsException{
    public void show() throws ClassNotFoundException{//so basically throws is used to declare the exceptions that a method can throw. In this case, the show() method is declaring that it can throw a ClassNotFoundException. This means that any code that calls the show() method must either handle the exception using a try-catch block or declare that it can also throw the exception using the throws keyword.
        Class.forName("oops.DemoException1");
    }
}
public class DemoException {
    public static void main(String[] args) {
        DemoThrowsException demo=new DemoThrowsException();
        try {
            demo.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception caught:class not found "+e.getMessage());
        }
        
        int a,b;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for a:");
        a=sc.nextInt();
        System.out.println("Enter a number for b:");
        b=sc.nextInt();

        int nums[]=new int[5];
        try{ 
            if (b==0){
                throw new CustomException("Division by zero is not allowed:custom exception");//throw keyword is used for throwing an exception manually using the throw keyword. In this case, we are throwing an customexception with a custom error message "Division by zero is not allowed". This is done to handle the case where the denominator b is zero, which would result in a division by zero error. By throwing the exception manually, we can catch it later in the catch block and handle it appropriately.
            }  
            int c=a/b;
            
            nums[10]=100;
            
        }catch(CustomException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception caught: "+e.getMessage());
        }
        finally{//finaly can be used in scenario where we want to close the resources like file, database connection etc. It is used to execute important code such as closing connection, stream etc. It is executed whether an exception is handled or not. The finally block always executes when the try block exits. The finally block is optional and can be used with try-catch blocks.
            System.out.println("This block will always execute");
        }
    }
}
