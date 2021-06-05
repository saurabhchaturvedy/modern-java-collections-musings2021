package Comparing_Things_05.Other_Orders;

import java.util.Arrays;
import java.util.List;

public class Student {

    private String name;
    private float gpa;
    private int height;
    private int debt;

    public Student(String name, float gpa, int height, int debt) {
        this.name = name;
        this.gpa = gpa;
        this.height = height;
        this.debt = debt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", height=" + height +
                ", debt=" + debt +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student("Fred",2.5f,5,300);
        Student student2 = new Student("James",6.5f,4,310);
        Student student3 = new Student("Bon",9.5f,6,230);
        Student student4 = new Student("Nick",7.5f,3,400);
        Student student5 = new Student("Bolshevik",4.5f,7,985);
        Student student6 = new Student("Dave",8.2f,5,887);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);

       // students.sort(new StudentGpaComparator());

      //  students.sort(new StudentHeightComparator());

        students.sort(new StudentDebtComparator());

        System.out.println(students);
    }
}
