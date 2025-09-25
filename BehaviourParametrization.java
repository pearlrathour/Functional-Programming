import java.util.List;
import java.util.function.Predicate;

public class BehaviourParametrization {
    public static void main(String[] args) {
        List<Integer> num= List.of(6,3,4,7);

        filterAndPrint(num, x->x%2==0);
        filterAndPrint(num, x->x%2!=0);
    }

    private static void filterAndPrint(List<Integer> num, Predicate<Integer> predicate){
        num.stream()
            .filter(predicate)
            .forEach(System.out::println);

    }
}
