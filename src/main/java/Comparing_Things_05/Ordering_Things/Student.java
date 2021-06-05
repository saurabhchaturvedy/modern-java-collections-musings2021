package Comparing_Things_05.Ordering_Things;

import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {

    private String name;

    private float gpa;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        return Float.compare(this.gpa, o.gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student("Fred", 5.4F);
        Student student2 = new Student("James", 8.4F);
        Student student3 = new Student("Derek", 3.4F);
        Student student4 = new Student("Bon", 1.4F);
        Student student5 = new Student("Terence", 7.4F);
        Student student6 = new Student("John", 6.4F);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);

        students.sort(null);

        System.out.println(students);
    }
}
