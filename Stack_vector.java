package collection;

import java.util.Vector;


import java.util.Stack;

public class Stack_vector {

    public static void main(String[] args) {

         /* first we will see the vectors in java which will help us in understanding the use of vector in java */

        Vector<Integer> V = new Vector();
        V.add(32);
        V.add(31);
        V.add(30);
        System.out.println(V);
        /* IN vectors the methods are synchronised that is there is lock on methods of vector*/

        /* stack extends vector , pop and peek is synchronised in stack , the add fucntion and some other fucntions in stack
        * are also avialable as stack extend vector and vectors are immplemented by list*/
        Stack<Integer> S = new Stack();
        S.push(65);
        S.push(66);
        S.push(69);
        int popped  = S.pop();
        S.pop();
        System.out.println(S);
        System.out.println("The item that is poped is "+ popped);
        System.out.println("The item at the top/peek is " + S.peek());
    }
}
