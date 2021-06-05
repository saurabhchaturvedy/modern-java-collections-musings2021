package Comparing_Things_05.Other_Orders;

import java.util.Comparator;

public class StudentHeightComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getHeight() - o2.getHeight();
    }
}
