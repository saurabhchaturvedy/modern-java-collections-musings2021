package Improving_Designs_07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {
        Student ramesh = new Student("ramesh",9.5f,5,800);
        Student sumit = new Student("sumit",3.5f,5,650);
        Student jayesh = new Student("jayesh",8.5f,5,300);
        Student deepak = new Student("deepak",19.5f,5,700);
        Student harish = new Student("harish",4.5f,5,567);

        List<Student> students = Arrays.asList(ramesh, sumit, jayesh, deepak, harish);

        Collections.sort(students,new Student.StudentComparator());

        for(Student student: students)
        {
            System.out.println(student);
        }

    }
}
