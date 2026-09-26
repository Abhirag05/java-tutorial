import java.util.List;
//it is still statically typed  since the type is inferred at compile time. The var keyword can only be used to declare local variables inside a method, constructor or initializer block. It cannot be used to declare instance variables, class variables or method parameters. The var keyword can only be used to declare a variable when the type can be inferred from the value assigned to it. If the type cannot be inferred, then we need to explicitly specify the type of the variable.it invented on java 10.
public class LocalVariableTypeReference {
    public static void main(String[] args) {
        var name = "John";//here we are using var keyword to declare a local variable. The type of the variable is inferred from the value assigned to it. In this case, the type of the variable is String.
        System.out.println(name);
        var age = 20;//here we are using var keyword to declare a local variable. The type of the variable is inferred from the value assigned to it. In this case, the type of the variable is int.
        System.out.println(age);
        var numbers = List.of(1, 2, 3, 4, 5);//here we are using var keyword to declare a local variable. The type of the variable is inferred from the value assigned to it. In this case, the type of the variable is List<Integer>.
        System.out.println(numbers);
    }
}
