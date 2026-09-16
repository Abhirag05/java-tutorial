public class TypeCast {
    public static void main(String[] args) {
        // type casting is converting one data type to another data type
        // there are 2 types of type casting
        // 1. implicit type casting (widening)
        // 2. explicit type casting (narrowing)
        int a = 10;
        double b = a; // implicit type casting
        System.out.println(b);
        double c = 10.5;
        int d = (int) c; // explicit type casting
        System.out.println(d);
        int e = 257;
        byte b1 = (byte) e;// takes modulo 256 of the number and stores it in byte
        System.out.println(b1);
    }
}
