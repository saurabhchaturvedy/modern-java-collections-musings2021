package Creating_And_Combining_Comparators_14.Creating_Comparators_Functional_Approach;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThenComparingTest {

    public static void main(String[] args) {

        List<Name> names = Arrays.asList(
                new Name("Fred", "Jones"),
                new Name("Jim", "Anderson"),
                new Name("Shiela", "Jones"),
                new Name("Shiela", "Smith"),
                new Name("Fred", "Smith"),
                new Name("Fred", "Anderson"),
                new Name("Jim", "Jones"),
                new Name("Shiela", "Anderson")
        );
        Comparator<Name> lnameComparator = (a,b) -> a.getLast().compareTo(b.getLast());
    //  Comparator<Name> lnameComparator = Comparator.comparing(Name::getLast); syntax sugar for above line
      Comparator<Name> fnameComparator = (a,b) -> a.getFirst().compareTo(b.getFirst());
      // above comparator orders by last name , but in such a scenario when last names are same ,
        // but order of first names for identical last names are arbitrary

        for(Name name:names)
        {
            System.out.println(name);
        }

  //    names.sort(lnameComparator);

        names.sort(lnameComparator.thenComparing(fnameComparator));

    //    names.sort(lnameComparator.thenComparing(name -> name.getFirst(),Comparator.reverseOrder()));

        System.out.println("After sorting :");
        System.out.println();
        for(Name name:names)
        {
            System.out.println(name);
        }
    }
}
