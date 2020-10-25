package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class ListInterface {

    public static void main(String[] args) {

        List<String> fruits = new LinkedList ();   /*here we write only "List" at the start because the list can be any i.e arraylist or linkedlist
                                                    the list interface is used here which can extend various list this is multiple inheritance actually achieved by
                                                   List interface*/
        List<String> vegetables = new ArrayList();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("Yellow");

        vegetables.add("ladyfinger");
        vegetables.add("potato");
        vegetables.add("tomato");

        fruits.addAll(vegetables);  //to combine to different list
        System.out.println(fruits);
       /* List<String> toremove  = new ArrayList ();
        toremove.add("apple");
        toremove.addAll(toremove);
        System.out.println(fruits);  this is used to remove certain element from the list*/
        /* other porperties of the Arraylist are
        *  add(element)
        * addAll(collection)
        * get(index)
         set(Index,value)
         * remove(index0
         * removeAll()
         * clear()
         * size()
         * contains()
         * isEmpty()
         * toArray()  */
    }
}
