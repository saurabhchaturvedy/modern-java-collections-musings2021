package Sets_Tree_Ordering_06;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {

    private String name;

    private String address;

    private float gpa;

    public Student(String name, String address, float gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(new Student("Saurabh","kanpur",9.5f));
        studentSet.add(new Student("Deepak","mumbai",19.5f));
        studentSet.add(new Student("Shailendra","delhi",29.5f));


        studentSet.add(new Student("Saurabh","lucknow",129.5f));

        System.out.println(studentSet);

        System.out.println(new Student("Saurabh","kanpur",9.5f).equals(new Student("Saurabh","lucknow",9.5f)));

        Student oldSaurabh = new Student("Saurabh","kanpur",9.5f);
        Student newSaurabh = new Student("Saurabh","kanpur",93.5f);

        System.out.println(studentSet.contains(newSaurabh));
        System.out.println(studentSet.contains(oldSaurabh));
    }
}
