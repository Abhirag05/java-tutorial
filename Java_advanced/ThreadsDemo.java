package oops;
//The thread is a lightweight process and it is a separate path of execution. It is a part of the process and it shares the same memory space. The thread is used to perform multiple tasks simultaneously. The thread can be created by extending the Thread class or by implementing the Runnable interface. The thread can be started by calling the start() method. The thread can be stopped by calling the stop() method. The thread can be paused by calling the sleep() method. The thread can be resumed by calling the resume() method. The thread can be interrupted by calling the interrupt() method.
class A implements Runnable{//Runnable is a functional interface that has only one abstract method run().
    public void run(){//we use run() method to define the code that will be executed by the thread. The run() method is called when the thread is started. The run() method is executed in a separate path of execution. The run() method can be overridden to define the code that will be executed by the thread.
        for(int i=0;i<50;i++){
            System.out.println("Thread A");
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Thread B");
        }
        try {
            Thread.sleep(10);//The sleep() method is used to pause the execution of the thread for a specified time. The sleep() method is a static method and it is called by the thread that is currently executing. The sleep() method throws an InterruptedException if the thread is interrupted while it is sleeping.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ThreadsDemo {
    public static void main(String[] args) {
        Thread thread=new Thread(new A());//Thread class is used to create a new thread. The Thread class has a constructor that takes a Runnable object as an argument. The Runnable object is the code that will be executed by the thread. The Thread class has a start() method that is used to start the thread execution. The start() method calls the run() method internally.
        B b=new B();
        thread.start();
        b.start();//start() method is used to start the thread execution and it calls the run() method internally.
    }
}
