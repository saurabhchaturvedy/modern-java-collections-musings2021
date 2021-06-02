package Comparing_Things_05.Equals_Anomaly;

public class Tire {

    int diameter;
    int width;

    public Tire(int diameter, int width) {
        this.diameter = diameter;
        this.width = width;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Tire tire = (Tire) obj;
        return this.diameter == tire.diameter && this.width == tire.width;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Tire))
//            return false;
//        Tire tire = (Tire) obj;
//        return this.diameter == tire.diameter && this.width == tire.width;
//    }

    @Override
    public String toString() {
        return "Tire{" +
                "diameter=" + diameter +
                ", width=" + width +
                '}';
    }
}
