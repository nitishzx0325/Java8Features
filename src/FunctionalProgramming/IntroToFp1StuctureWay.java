package FunctionalProgramming;

import java.util.List;

public class IntroToFp1StuctureWay {
    public static void main(String[] args) {
        //traditional approach
        printAllOfNumber(List.of(12,9,78,56,55));
        // new way
        printAllOfNumberFunctionally(List.of(12,44,10,9,78,56,55));
    }
    private static void print(int n){
        System.out.println(n);
    }
    private static void printAllOfNumberFunctionally(List<Integer> integers) {
        integers.stream()
                .forEach(IntroToFp1StuctureWay::print);    //method reference(::)
    }

    private static void printAllOfNumber(List<Integer> integers) {
        for(int i:integers){
            System.out.println(i);
        }
    }

}
