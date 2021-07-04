package Creating_And_Combining_Comparators_14.Comparator_For_Ordering_Map_Entries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class OrderedEntries {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Jim",12);
        map.put("Belinda",12);
        map.put("Sheila",12);
        map.put("Alan",10);
        map.put("Alice",10);
        map.put("Susan",3);
        map.put("Fred",9);


        Comparator<Map.Entry<String,Integer>> peopleComparator = Map.Entry.<String,Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey());

        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        entries.sort(peopleComparator);

        for(Map.Entry<String,Integer> entry : entries)
        {

            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
