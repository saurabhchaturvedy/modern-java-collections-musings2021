package Comparing_Things_05.Equals_Anomaly;

public class TireTest {

    public static void main(String[] args) {
        Tire tire1 = new Tire(10, 20);
        Tire tire2 = new Tire(10, 20);

        System.out.println(tire1.equals(tire2));
        System.out.println(tire2.equals(tire1));

        TruckTire truckTire1 = new TruckTire(10, 20, 350);
        TruckTire truckTire2 = new TruckTire(10, 20, 350);

        System.out.println(truckTire1.equals(truckTire2));


        System.out.println(" Tire1==truckTire1 " + tire1.equals(truckTire1));
        System.out.println(" truckTire1==Tire1 " + truckTire1.equals(tire1));  // Symmetry rule is broken here when equals() without getClass() check is used .

        // Solution could be to mark equals() method of tire as final to achieve symmetry.
        // Although doing that will prohibit changing equality logic of TruckTire on basis of its additional fields .
        // If no solution comes good , then its a design issue .

    }
}
