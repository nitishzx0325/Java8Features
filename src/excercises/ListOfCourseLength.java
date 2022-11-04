package excercises;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfCourseLength {
    public static void main(String[] args) {


       var list = List.of("spring", "spring boot", "API", "Microservices", "AWS", "Docker", "Kubernates", "Azure");

        List<Integer> integers = printListOfCourseLength(list);
        System.out.println(integers);
    }

    private static List<Integer> printListOfCourseLength(List<String> list) {
        return list.stream()
                .map(a->a.length())
                .collect(Collectors.toList());
    }
}