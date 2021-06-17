package Sets_Tree_Ordering_06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Item {

    private String name;
    private String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) &&
                Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Item item1 = new Item("james","abc");
        Item item2 = new Item("john","abc");
        Item item3 = new Item("john","abc");

       Set<Item> itemSet = new HashSet<>();
       itemSet.add(item1);
       itemSet.add(item2);
       itemSet.add(item3);

        System.out.println(itemSet);
    }
}
