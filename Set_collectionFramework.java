package collection;
/* tyoes of set are hashset , tree set , enumset , Linked set , enum set in not much used*/
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_collectionFramework {

    public static void main(String[] args) {

        Set<Integer> s = new HashSet<Integer>();
        /* only one copy of single element is saved in the set and the types of set are hashset tree set
        * elements are randomly inserted in hashset
        *
        * Set<Integer> s = new LinkedHashSet<Integer>();  this type helps in the removal of the elements in which they are inserted
        * Set<Integer> s = new TreeSet<Integer>();  this helps in insertion of the elements in sorted manner*/

        s.add(1);
        s.add(2);
        s.add(6);
        s.add(9);
        s.add(100);
        System.out.println(s);
        Set<Integer> s2 = new TreeSet<Integer>();

        s2.add(1);
        s2.add(7);
        s2.add(2);
        System.out.println(s2);
        //s.addAll(s2);//union this is commented so that retain will give proper values else the
        // intersection will be from the union s and s2 and containsall is used for subset
        System.out.println(s);
        s.retainAll(s2);//intesection
        System.out.println(s);




    }
}
