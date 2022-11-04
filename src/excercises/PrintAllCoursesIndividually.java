package excercises;

import java.util.*;
public class PrintAllCoursesIndividually {
    public static void main(String[] args) {
        var list = List.of("spring","spring boot","API","Microservices","AWS","Docker","Kubernates","Azure");
        printAllCourses(list);
    }

    private static void printAllCourses(List<String> list) {
        list.stream()
                .forEach(System.out::println);
    }
}
