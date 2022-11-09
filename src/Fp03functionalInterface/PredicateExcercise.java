package Fp03functionalInterface;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PredicateExcercise {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
       List<Integer> li= exe(list,x->x*x);
        System.out.println(li);
    }
    public static List<Integer> exe(List<Integer> list, Function<Integer, Integer> fun){
        return list.stream()
                .map(fun)
                .collect(Collectors.toList());

    }
}
