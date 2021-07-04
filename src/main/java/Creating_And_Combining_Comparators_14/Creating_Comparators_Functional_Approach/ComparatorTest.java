package Creating_And_Combining_Comparators_14.Creating_Comparators_Functional_Approach;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Jim", "Sheila", "Fred");
        System.out.println(strings);
        Comparator<Object> objectComparator = Collections.reverseOrder();
        strings.sort(objectComparator);
        // Comparator.sort() gives compile time error

        System.out.println(strings);

        List<Integer> integers = Arrays.asList(1, 7, 3, 8, 6, 11, 5, 17, 13);

        integers.sort(objectComparator);

        System.out.println(integers);

        Comparator<String> stringComparator = (a,b) -> a.length()-b.length();

        strings.sort(stringComparator);

        System.out.println(strings);

     //   Comparator<String> stringComparator1 = Collections.reverseOrder(stringComparator);

        Comparator<String> reversed = stringComparator.reversed(); // default instance way

        strings.sort(reversed);

        System.out.println(strings);
    }
}
