package excercises;

import java.util.List;

public class PrinttingSquareOfEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        printEvenNumberSquare(list);
    }

    private static void printEvenNumberSquare(List<Integer> list) {
        list.stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .forEach(System.out::println);
    }
}
