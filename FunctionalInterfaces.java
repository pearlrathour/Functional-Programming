import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces {

    // Custom Functional Interface
    @FunctionalInterface
    interface MyFunction {
        int apply(int x);
    }

    public static void main(String[] args) {
        List<Integer> num= List.of(6,3,4,7);

        // Predicate: boolean function (Condition checking)
        // BiPredicate -> 2 input
        Predicate<Integer> isEvenPredicate= n-> n%2==0;

        // Function: 1 input -> 1 output (Data transformation)
        Function<Integer, Integer> squareFunction= n->n*n;

        // Consumer: 1 input -> 0 output (Performing action)
        Consumer<Integer> soutConsumer= System.out::println;

        // Suplier: no input -> return smthg
        Supplier<Integer> randomIntegerSupplier= ()->0;

        UnaryOperator<Integer> unaryOperator= x-> 3*x;

        num.stream()
            .filter(isEvenPredicate)
            .map(squareFunction)
            .forEach(soutConsumer);

        System.out.println(randomIntegerSupplier.get());

        MyFunction square = n -> n * n;
        System.out.println(square.apply(5));

    }
}
