package Comparing_Things_05.Hashed_Storage;

public class Student {

    private String firstName;

    public Student(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return firstName.length();
    }
}
