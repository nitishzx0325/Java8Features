package excercises;

import java.util.List;
import java.util.stream.Collectors;

public class LisOfEvenNumber {
    public static void main(String[] args) {


    List<Integer> list = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

    List<Integer> integers = printListOfEvenNumber(list);
        System.out.println(integers);
}

    private static List<Integer> printListOfEvenNumber(List<Integer> list) {
        return  list.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

    }


}