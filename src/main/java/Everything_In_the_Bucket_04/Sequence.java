package Everything_In_the_Bucket_04;

import java.util.Iterator;


class SequenceIterator implements Iterator<Integer> {

    Sequence sequence;
    int nextValue;

    public SequenceIterator(Sequence sequence) {
        this.sequence = sequence;
        this.nextValue = sequence.start;
    }

    @Override
    public boolean hasNext() {
        return this.nextValue <= this.sequence.limit;
    }

    @Override
    public Integer next() {
        if (this.sequence.limit < this.nextValue) {
            try {
                throw new Exception("Element not found : ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        int rv = this.nextValue;
        this.nextValue += this.sequence.limit;
        return rv;
    }
}


public class Sequence implements Iterable<Integer> {

    int start;
    int increment;
    int limit;

    public Sequence(int start, int increment, int limit) {
        this.start = start;
        this.increment = increment;
        this.limit = limit;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SequenceIterator(this);
    }

    public static void main(String[] args) {
        for (Integer i : new Sequence(1, 1, 100)) {
            System.out.print(i + " ");
        }
    }
}
