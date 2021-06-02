package Everything_In_the_Bucket_04;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class BackwardIterator {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc", "def", "ghi");
        ListIterator<String> stringListIterator = stringList.listIterator(stringList.size());
        while (stringListIterator.hasPrevious()) {
            System.out.print(stringListIterator.previous() + " ");
        }

    }
}
