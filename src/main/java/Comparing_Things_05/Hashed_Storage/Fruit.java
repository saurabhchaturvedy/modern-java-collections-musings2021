package Comparing_Things_05.Hashed_Storage;

public class Fruit {

    public enum Color {RED, BLUE, GREEN, ORANGE, YELLOW}

    private Color color;

    public Fruit(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color=" + color +
                '}';
    }

    public int hashCode() {
        return color.ordinal();
    }
}
