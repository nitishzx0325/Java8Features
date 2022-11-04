package excercises;

import java.util.List;

public class PrintNumberOFCharacter {
    public static void main(String[] args) {
        var list = List.of("spring","spring boot","API","Microservices","AWS","Docker","Kubernates","Azure");
        printAllCourses(list);
    }

    private static void printAllCourses(List<String> list) {
        list.stream()
                .map(n->n.length())
                .forEach(System.out::println);
    }
}

