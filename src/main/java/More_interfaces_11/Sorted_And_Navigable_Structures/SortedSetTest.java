package More_interfaces_11.Sorted_And_Navigable_Structures;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>(Arrays.asList(1,7,3,9,2,4,8,5,10,6));

        System.out.println(set);

        System.out.println(set.headSet(5)); // 5 is excluded

        System.out.println(set.tailSet(7));  // 7 is included

        System.out.println(set.subSet(3,8));  // 3 gets included , 8 is excluded
    }
}
