package Comparing_Things_05.Hashed_Storage;

public class FakeHashStorage {


    private final int STORE_SIZE = 10;

    private Object[] store = new Object[STORE_SIZE];


    private void insert(Object o) {
        store[storeLocation(o)] = o;
    }

    private boolean contains(Object o) {
        return store[storeLocation(o)] != null;
    }

    private int storeLocation(Object o) {
        return Math.abs(o.hashCode()) % STORE_SIZE;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Object o : store) {
            if (o != null) {
                stringBuilder.append(o).append(",");
            }

        }

        if (stringBuilder.length() >= 2)
            stringBuilder.setLength(stringBuilder.length() - 2);

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        FakeHashStorage fakeHashStorage = new FakeHashStorage();

        fakeHashStorage.insert(new Student("Ram"));
        fakeHashStorage.insert(new Student("Ramesh"));
        fakeHashStorage.insert(new Student("deep"));
        //  fakeHashStorage.insert(new Student("dees"));  this entry overrides above entry if added as name lengths are same , i.e 4
        fakeHashStorage.insert(new Student("Jignesh"));


        fakeHashStorage.insert(new Fruit(Fruit.Color.BLUE));
        fakeHashStorage.insert(new Fruit(Fruit.Color.GREEN));

        System.out.println(fakeHashStorage);


        System.out.println(fakeHashStorage.contains(new Student("Rameshx")));
    }
}
