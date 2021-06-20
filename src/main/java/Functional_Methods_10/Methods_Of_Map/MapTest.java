package Functional_Methods_10.Methods_Of_Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "mastercard");
        integerStringMap.put(2, "visa");
        integerStringMap.put(3, "amdocs");
        integerStringMap.put(4, "paypal");

        integerStringMap.forEach((key, value) -> {

            System.out.println(key + " " + value);
            //  integerStringMap.compute(3,(k,v)-> v.concat("-test"));
            integerStringMap.compute(3, (k, v) -> null);

        });

        System.out.println();

        integerStringMap.entrySet().forEach((entry ->
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        ));
    }
}
