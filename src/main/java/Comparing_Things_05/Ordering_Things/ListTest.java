package Comparing_Things_05.Ordering_Things;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(8);
        integerList.add(14);
        integerList.add(2);

        System.out.println(integerList);

        integerList.sort(null);

        System.out.println(integerList);
    }
}
