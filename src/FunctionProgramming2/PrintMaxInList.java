package FunctionProgramming2;

import java.util.List;

import static java.util.Collections.max;

public class PrintMaxInList {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
//        int l=max(list);
        int l=listmax(list);
        System.out.println("Max: "+l);
    }

    private static int listmax(List<Integer> list) {
        return list.stream()
                .reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
    }
}
