package Maps_08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "abc");
        map.put(2, "def");
        map.put(3, "ghi");

        Set<Integer> integerSet = map.keySet();

        for (Integer i : integerSet) {
            System.out.println(i + " ");
        }

        Collection<String> values = map.values();

        for (String str : values) {
            System.out.println(str + " ");
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
    }
}
