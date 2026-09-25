class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class MethodReference {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //using lambda expression
        numbers.forEach(n->System.out.println(n));
        //using method reference    
        numbers.forEach(System.out::println);

        //another example
        List<String> names = List.of("John", "Jane", "Jack", "Jill");
        System.out.println(names);
        List <String> upperCaseNames = names.stream()
                .map(String::toUpperCase)//see here we are using method reference instead of lambda expression. Instead of writing n->n.toUpperCase() we are using String::toUpperCase which is more readable and concise.
                .toList();
        System.out.println(upperCaseNames);

        //we can also do the construtor
        List<Student> students = names.stream()
               // .map(name -> new Student(name, 20))//here we are using lambda expression to create a new Student object. Instead of writing name->new Student(name, 20) we can use method reference like this: Student::new but it will not work here because the constructor of Student class takes two parameters and we are passing only one parameter here. So we cannot use method reference here.
                .map(Student::new)//here we are using constructor reference to create a new Student object. Instead of writing name->new Student(name, 20) we are using Student::new which is more readable and concise.
                .toList();
        System.out.println(students);


        
    }
}
