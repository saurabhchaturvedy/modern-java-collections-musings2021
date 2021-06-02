package Lists_In_More_Detail_03;

import java.util.*;

public class MyArrayList<E> implements List<E> {


    private E[] data = (E[]) (new Object[10]);
    private int count = 0;

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        ensureCapacity(count + 1);
        data[count++] = e;
        return true;
    }

    private void ensureCapacity(int minCapacity) {
        if (data.length < minCapacity) {
            data = Arrays.copyOf(data, minCapacity);
        }
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(data, 0, count, null);
        count = 0;
    }

    @Override
    public E get(int index) {
        if (index >= 0 || index < count) {
            return data[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds ");
        }
    }

    @Override
    public E set(int index, E element) {
        if (index >= 0 && index < count) {
            E val = data[index];
            data[index] = element;
            return val;
        } else {
            throw new ArrayIndexOutOfBoundsException(index + " is not a valid index :");
        }

    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > count) {
            throw new ArrayIndexOutOfBoundsException(index + " is not a valid index :");
        }
        if (count == index) {
            add(element);
            return;
        }
        ensureCapacity(count + 1);
        System.arraycopy(data, index, data, index + 1, count - index);
        data[index] = element;
        count++;


    }

    @Override
    public E remove(int index) {
        E rv = get(index);
        System.arraycopy(data, index + 1, data, index, count - index - 1);
        data[count--] = null;
        return rv;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
