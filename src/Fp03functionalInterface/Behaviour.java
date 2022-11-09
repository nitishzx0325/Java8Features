package Fp03functionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class Behaviour {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        Predicate<Integer> epre=x->x%2==0;

        list.stream()
                .filter(x->x%2==0)
                .forEach(System.out::println);

        Predicate<Integer> opre=x->x%2!=0;
//        extracted(list);
        extracted(list,x->x%2==0);
        extracted(list,x->x%2!=0);


    }

    private static void extracted(List<Integer> list,Predicate<Integer> predicate) {
        list.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
