package collection;

import java.util.PriorityQueue;

public class Priority_queue {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("apple");
        pq.add("mango");
        pq.add("kiwi");
        pq.add("banana");
        System.out.println(pq);
        System.out.println("the element at the peek is "+ pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());

        /* in priority queue while storing are stored in any order but at removal they are in certain order */

    }
}
