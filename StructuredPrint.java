import java.util.List;

public class StructuredPrint {
    public static void main(String[] args) {
        printAllNumberInListStrc(List.of(12,9,3));
    }

    private static void printAllNumberInListStrc(List<Integer> numbers) {
            for(int n : numbers) 
                System.out.println(n);
        }
}
