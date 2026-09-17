//we use while in scenario when we dont know when to stop or more like when dynamically changes the stopping value unlike for loop where we know when to stop.
public class WhileLoop {
    public static void main(String args[]){
        int n=10;
        int i=0;
        while (i<n){
            System.out.println("Printing:"+i);
            int c=0;
            while(c<3){//nested while loop
                System.out.println("Hello");
                c++;
            }
            i++;
        }
    }
    
}
