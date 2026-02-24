package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Learn_Queue {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(1);//adding into thr queue
//        queue.offer(2);
//        queue.offer(3);
//        queue.offer(4);
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());//peek is defiened which is next to ready to serve


//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(11);
//        queue.add(2);
//        queue.add(23);
//        queue.add(49);
//        System.out.println(queue);


        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(23);
        arrayDeque.offer(34);
        System.out.println(arrayDeque);
        arrayDeque.offerFirst(1);
        arrayDeque.offerLast(2);
        System.out.println(arrayDeque);
        arrayDeque.offer(4);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque);
    }
}
