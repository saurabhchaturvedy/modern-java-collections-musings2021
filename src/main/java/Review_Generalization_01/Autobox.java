package Review_Generalization_01;

import java.util.ArrayList;
import java.util.List;

public class Autobox {

    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(new Integer(5)); // Autoboxing
        Integer iw = (Integer) l.get(0);
        int i = iw.intValue();
        System.out.println(i);
        l.add(8);
        Integer i2 = (Integer) l.get(1); // Auto-boxing
        i=i2;  // Auto-unboxing
        System.out.println(i);


    }
}
