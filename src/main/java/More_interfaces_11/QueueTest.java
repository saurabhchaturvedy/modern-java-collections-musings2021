package More_interfaces_11;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("apple");
        queue.add("carrot");
        queue.add("banana");
        queue.add("mango");

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();


        System.out.println(queue);
    }
}
