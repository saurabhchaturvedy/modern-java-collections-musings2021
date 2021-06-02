package Everything_In_the_Bucket_04;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class IteratorIndex {


    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc", "def", "ghi");
        ListIterator<String> stringListIterator = stringList.listIterator();

        System.out.println("next index "+stringListIterator.nextIndex());
        System.out.println("previous index "+stringListIterator.previousIndex());
    }
}
