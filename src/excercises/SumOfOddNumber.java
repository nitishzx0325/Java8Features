package excercises;

import java.util.List;

public class SumOfOddNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);
//        int l=max(list);
        int l=cubeSum(list);
        System.out.println("sum: "+l);
    }

    private static int cubeSum(List<Integer> list) {
        return list.stream()
                .filter(n->n%2!=0)
                .reduce(0,(a,b)->a+b);
    }
}


