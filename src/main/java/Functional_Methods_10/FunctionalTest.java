package Functional_Methods_10;

import java.util.Arrays;
import java.util.List;

public class FunctionalTest {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("John", "Albert", "Cabelle", "Duke", "Klemp", "Brian");

        stringList.forEach((s -> System.out.println(s)));

        stringList.removeIf(s-> s.startsWith("K"));

        System.out.println();
        stringList.forEach(System.out::println);

        stringList.replaceAll(s->s.toUpperCase());

        stringList.forEach(System.out::println);
    }
}
