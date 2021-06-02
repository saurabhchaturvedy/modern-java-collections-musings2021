package Comparing_Things_05.Equals_Anomaly;

public class TruckTire extends Tire {

    int loadCapacity;

    public TruckTire(int diameter, int width, int loadCapacity) {
        super(diameter, width);
        this.loadCapacity = loadCapacity;
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TruckTire))
            return false;
        TruckTire truckTire = (TruckTire) obj;
        return this.width == truckTire.width && this.diameter == truckTire.diameter && this.loadCapacity == truckTire.loadCapacity;
    }

    @Override
    public String toString() {
        return "TruckTire{" +
                "loadCapacity=" + loadCapacity +
                ", diameter=" + diameter +
                ", width=" + width +
                '}';
    }
}
