package Functional_Methods_10;

import java.util.Arrays;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("ram", 10, 9.8f), new Student("shyam", 20, 8.8f), new Student("deepak", 15, 3.2f));

        studentList.sort((s1, s2) -> s1.getHeight() - s2.getHeight());

        for (Student student : studentList) {

            System.out.println(student);
        }
    }
}
