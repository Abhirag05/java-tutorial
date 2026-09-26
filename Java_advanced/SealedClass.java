//sealed class in java is an new feature introduced in java 15. A sealed class is a class that can only be extended by a specific set of classes. This is useful when you want to restrict the inheritance of a class to a specific set of classes. A sealed class can have one or more subclasses, but all subclasses must be explicitly declared in the sealed class declaration. The subclasses can be either final, non-sealed or sealed. A final subclass cannot be extended further, a non-sealed subclass can be extended further and a sealed subclass can only be extended by the classes that are explicitly declared in the sealed class declaration.
sealed class A permits B, C {
}
final class B extends A {
}
non-sealed class C extends A {
}

public class SealedClass {
   public static void main(String[] args) {
    
   }
}
