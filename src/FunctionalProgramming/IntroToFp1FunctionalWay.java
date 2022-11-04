package FunctionalProgramming;
import java.util.*;
public class IntroToFp1FunctionalWay {
    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        printAllNumber(integers);
        printAllEvenNumber(integers);
        printAllEvenNumberByLamdaExpression(integers);
    }

    private static void printAllEvenNumberByLamdaExpression(List<Integer> list) {
        list.stream()
                .filter(n->n%2==0)  //lamda expression
                .forEach(System.out::println);
    }

    private static void printAllEvenNumber(List<Integer> integers) {
        integers.stream()
                .filter(IntroToFp1FunctionalWay::check)
                .forEach(IntroToFp1FunctionalWay::print);
    }

    private static boolean check(Integer integer) {
        System.out.println("Only Even number");
        return integer%2==0;
    }


    private static void print(int n){
        System.out.println(n);
    }
    private static void printAllNumber(List<Integer> integers) {
        integers.stream()
                .forEach(IntroToFp1FunctionalWay::print);
    }
}
