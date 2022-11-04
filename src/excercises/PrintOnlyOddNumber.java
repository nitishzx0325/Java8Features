package excercises;
import java.util.*;
public class PrintOnlyOddNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        printOddNumber(list);
    }

    private static void printOddNumber(List<Integer> list) {
        list.stream()
                .filter(n->n%2!=0)
                .forEach(System.out::println);
    }
}
