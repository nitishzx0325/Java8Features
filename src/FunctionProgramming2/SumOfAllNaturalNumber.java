package FunctionProgramming2;

import java.util.List;

public class SumOfAllNaturalNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
     int ss= printSumOfAllNumber(list);
        System.out.println(ss);
        System.out.println("/////////////////////////////////////////////");
        int l= printSumOfAllNumberByLamda(list);
        System.out.println(l);
    }

    private static int printSumOfAllNumberByLamda(List<Integer> list) {
        return list.stream()
                .reduce(0,(a,b)->a+b);
    }

    private static int printSumOfAllNumber(List<Integer> list) {
        return list.stream()
                .reduce(0,SumOfAllNaturalNumber::sum);

    }

    private static Integer sum(Integer integer, Integer integer1) {
        return integer+integer1;
    }
}
