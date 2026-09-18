//by default the string is immutable but we can make it mutable with the help of String builder and String buffer

public class DemoString {
    public static void main(String[] args) {
        String name =new String("Abhi");//creates new string instead of taking the values from the existing pool
        //String name;also works

        System.out.println(name.charAt(0));
        
        //strings are immutable,if we create 2 string references witch same value it creates only one object in the heap memory (String constant pool) where the 2 variable reference points to the same object to avoid it we can use 'new'
        String a="hi";
        String b="hi";
        System.out.println(a==b);//true
       
        String c=new String("hi");
        System.out.println(a==c);//false '==' checks the reference equals() checks the content

        System.out.println(a.equals(c));//true

        //string buffer and string builder .so string buffer creates an variable which refer the buffer object and in that object we can make the modification,it is thread safe,mutable,slower compared to the string builder.string builder is commonly used.
        String s1="Monkey d ";
        
        System.out.println("Before string buffer:"+s1);
        
        StringBuffer sb=new StringBuffer(s1);
        sb.append("luffy");
       
        System.out.println("After string buffer:"+sb);

    }
}


