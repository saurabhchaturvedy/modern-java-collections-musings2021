package Sets_Tree_Ordering_06;

import java.util.Set;
import java.util.TreeSet;

public class Course {

    private String name;
    private int duration;

    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }

    public static void main(String[] args) {
        Set<Course> courseSet = new TreeSet<>(new CourseComparator());
        courseSet.add(new Course("java",2));
        courseSet.add(new Course("physics",1));
        courseSet.add(new Course("geography",5));

        System.out.println(courseSet);
    }
}
