package Need_For_Generics_02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    private static void addDate(List list) {
        list.add(LocalDateTime.now());
    }

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("john");
        nameList.add("ram");
        nameList.add("deepak");
        nameList.add("dabbu");

        addDate(nameList);

      //  String s = nameList.get(0);

        for(int i=0; i<nameList.size(); i++)
        {
            String name = nameList.get(i);
            System.out.println("name "+name);
            // after printing dabbu , it gives error as Exception in thread "main" java.lang.ClassCastException: java.time.LocalDateTime cannot be cast to java.lang.String
        // Which proves , it is still a list of everything , i.e objects and casts are applied internally in the code , by virtue of TypeErasure .
        }
    }
}
