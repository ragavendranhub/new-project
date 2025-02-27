package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        /*
           === Safer methods ===
           offer() -> to add an element in Queue
           poll() -> to remove an element in Queue
           peek() -> to return an element without removing it from Queue
         */

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);


        queue.poll();

        System.out.println(queue.peek());

        /*
           === Unsafer methods ===
           add() -> to add an element in Queue
           remove() -> to remove an element in Queue
           element() -> to return an element without removing it from Queue
         */

        queue.add(1);
        queue.add(2);
        queue.add(3);

        for (int num : queue) {
            if (num == 3) {
                queue.remove(3);
            }
        }

        System.out.println(queue.element());
    }
}
