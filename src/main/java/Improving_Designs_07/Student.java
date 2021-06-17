package Improving_Designs_07;

import java.util.Comparator;

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

    public static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.getName());
        }
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
}
