package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque_arraydeque {

    public static void main(String[] args) {

        Deque<Integer> de = new ArrayDeque<Integer>();
       // ArrayDeque<Integer> de = new ArrayDeque<Integer>();   function of Arraydequeue
        {

            de.add(1);
            de.add(3);
            de.addLast(4); //this both throw exceptions
            de.offerLast(2); //this dosent throw exception
            de.offerFirst(7);
            de.addFirst(9);//this throws exceptions
            System.out.println(de);
            de.removeFirst(); //this is for removal
            de.removeLast();
            System.out.println(de.getFirst());//element at the first position
            System.out.println(de.getLast()); //this is to find the top or last position
            System.out.println(de);

            de.pollFirst();
            System.out.println(de);
            de.pollLast();
            System.out.println(de);
            System.out.println(de.peekFirst());


        };

    }
}
