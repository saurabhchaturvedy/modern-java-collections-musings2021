package Review_Generalization_01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSet {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("B");
        list.add("F");
        list.add("B");
        list.add("K");

        Set set = new HashSet(list);
        System.out.println("Set : "+set);
    }
}
