package excercises;

import java.util.List;

public class PrintAllCourseWhoseLengthMoreThan4 {
    public static void main(String[] args) {
        var list = List.of("spring", "spring boot", "API", "Microservices", "AWS", "Docker", "Kubernates", "Azure");
        printAllCourses(list);
    }

    private static void printAllCourses(List<String> list) {
        list.stream()
                .filter(n -> n.length()>=4)
                .forEach(System.out::println);
    }
}

