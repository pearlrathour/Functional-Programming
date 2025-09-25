import java.util.List;

public class Main {
    public static void main(String[] args) {
        printAllNumberInListFunc(List.of(12,9,3));
        printSquaresofEvenNumbers(List.of(12,3,9));
    }

    private static void printSquaresofEvenNumbers(List<Integer> num) {
        num.stream()
            .filter(n -> n%2==0)
            .map(n -> n*n)
            .forEach(System.out::println);
    }

    // Functional Approach
    private static void printAllNumberInListFunc(List<Integer> numbers) {

        numbers.stream()
            .forEach(Main::print);  // Method ref

        System.out.println();

        numbers.stream()
            .filter(Main::isEven)
            .forEach(System.out::println);

        System.out.println();
    
        // Lambda expression
        numbers.stream()
            .filter(n->n%2==0)
            .forEach(System.out::println);
    }

    private static boolean isEven(int n){
        return n%2==0;
    }

    private static void print(int n){
        System.out.println(n);
    }
    
}
