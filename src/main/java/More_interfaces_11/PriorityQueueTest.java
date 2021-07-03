package More_interfaces_11;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        Queue<Student> studentQueue = new PriorityQueue<>();

        studentQueue.offer(new Student("ram",3.5f));
        studentQueue.offer(new Student("shyam",8.5f));
        studentQueue.offer(new Student("deepak",5.5f));

        System.out.println(studentQueue);
    }
}
