package excercises;

import java.util.List;

public class PrintAllCoursesContainSpring {
    public static void main(String[] args) {
        var list = List.of("spring", "spring boot", "API", "Microservices", "AWS", "Docker", "Kubernates", "Azure");
        printAllCourses(list);
    }

    private static void printAllCourses(List<String> list) {
        list.stream()
                .filter(n -> n.contains("spring"))
                .forEach(System.out::println);
    }
}
