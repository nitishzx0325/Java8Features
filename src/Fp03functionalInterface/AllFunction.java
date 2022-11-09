package Fp03functionalInterface;

import java.util.List;
import java.util.function.*;

public class AllFunction {

    public static void main(String[] args) {
        List<Integer> list = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
//        predicate return boolean value
        Predicate<Integer> pre=x->x%2==0;
//        Function take input and return output
        Function<Integer, Integer> func=(x)->x++;

        //consumer are used for processing not return any thing

        Consumer<Integer> print=x-> System.out.println();

        //operator are take input and return same formate of output
        BinaryOperator<Integer> sumBinaryOperator=(x,y)->x+y;

        //supplier no input but return something
        Supplier<Integer> randomInteger=()->2;
        System.out.println(randomInteger.get());

//        take 2 input and return boolean
        BiPredicate<Integer,String> bipredicate=(number,string)->true;
        System.out.println(bipredicate.test(5,"a"));
    }
}
