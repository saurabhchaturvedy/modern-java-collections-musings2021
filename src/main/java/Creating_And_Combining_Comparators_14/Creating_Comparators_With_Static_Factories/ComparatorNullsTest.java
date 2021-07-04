package Creating_And_Combining_Comparators_14.Creating_Comparators_With_Static_Factories;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorNullsTest {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple",null, "kiwi", "guava");

        System.out.println(strings);
       // strings.sort(Comparator.naturalOrder());  this fails in case of null values in the list
        strings.sort(Comparator.nullsLast(Comparator.naturalOrder()));
        // strings.sort(Comparator.nullsFirst(Comparator.naturalOrder()));   [null,apple, guava, kiwi]
        System.out.println(strings);
    }
}
