package oops;
//so here what happens is that we have two threads which are trying to increment the count variable of Counter class. So when both threads are trying to increment the count variable at the same time then it will create a race condition and the final value of count variable will not be 2000. So to avoid this race condition we can use synchronized keyword in increment() method of Counter class. So now when one thread is executing the increment() method then other thread will have to wait until the first thread completes its execution. So now the final value of count variable will be 2000.
class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable ob1=()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        };
        Runnable ob2=()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        };
        Thread t1=new Thread(ob1);//it goes to the new state
        Thread t2=new Thread(ob2);
        t1.start();//it goes to the runnable state and then it will go to the running state when the thread scheduler picks it up for execution.or when run() method it is in the running state it will go to the terminated state when the run() method completes its execution.
        t2.start();
        t1.join();//join() method is used to wait for the thread to complete its execution. The join() method is called by the main thread and it waits for the thread t1 to complete its execution. The join() method throws InterruptedException if the thread is interrupted while it is waiting.
        t2.join();
        System.out.println(c.count);
    }   
}
