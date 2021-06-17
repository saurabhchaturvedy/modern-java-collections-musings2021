package Improving_Designs_07.Improving_Design_Factory;

import java.util.Comparator;

public class Student {


    private String name;
    private int height;
    private int debt;
    private float gpa;

    public Student(String name, float gpa, int height, int debt) {
        this.name = name;
        this.height = height;
        this.debt = debt;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


    private static final GradeComparator gradeComparator = new GradeComparator();
    private static final NameComparator nameComparator = new NameComparator();


    public static Comparator<Student> getGradeComparator() {

        return gradeComparator;
    }

    public static Comparator<Student> getNameComparator() {

        return nameComparator;
    }


    private static class GradeComparator implements Comparator<Student> {


        @Override
        public int compare(Student o1, Student o2) {
            return Float.compare(o1.gpa, o2.getGpa());
        }
    }

    private static class NameComparator implements Comparator<Student> {


        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.getName());
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", debt=" + debt +
                ", gpa=" + gpa +
                '}';
    }
}
