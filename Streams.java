import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> num= List.of(6,3,4,7,4);

        int sum= addListFunc(num);
        System.out.println("SUM: " + sum);

        // ---- COMPARATOR ---- //
        System.out.print("DISTINCT: ");
        num.stream().distinct().forEach(System.out::print);
        System.out.println();

        System.out.print("SORTED: ");
        num.stream().sorted().forEach(System.out::print);
        System.out.println();

        System.out.print("COMPARATOR NATURAL ORDER SORTED: ");
        num.stream().sorted(Comparator.naturalOrder()).forEach(System.out::print);
        System.out.println();

        System.out.print("COMPARATOR REVERSE ORDER SORTED: ");
        num.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();

        System.out.print("COMPARATOR COMPARIING: ");
        num.stream().sorted(Comparator.comparing(n->n*n)).forEach(System.out::print);
        System.out.println();


        // ---- COLLECTOR ---- //
        // create another list from curernt list
        List<Integer> square= num.stream()
            .map(n->n*n)
            .collect(Collectors.toList());
        System.out.println("Square Collector: " + square);
    }

    // reduce -> accumulate, single output from multiple inputs
    private static int addListFunc(List<Integer> num) {
        return num.stream()
            .reduce(0, (x,y) -> x+y);
    }
}
