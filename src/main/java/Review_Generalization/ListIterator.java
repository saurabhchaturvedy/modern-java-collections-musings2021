package Review_Generalization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("carrot");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element : " + iterator.next());
        }

        // iterator.next(); throws NoSuchElementException
    }
}
