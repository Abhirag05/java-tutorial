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

        
    }
}
