package excercises;

import java.util.List;

public class CubeSum {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,2);
//        int l=max(list);
        int l=cubeSum(list);
        System.out.println("sum: "+l);
    }

    private static int cubeSum(List<Integer> list) {
        return list.stream()
                .map(n->n*n)
                .reduce(0,(a,b)->a+b);
    }
}
