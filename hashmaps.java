package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmaps {

    public static void main(String[] args) {

        Map<String , Integer> Mp = new HashMap<String,Integer>();

        Mp.put("one",1);
        Mp.put("two",24);
        Mp.put("three",69);
        Mp.put("four",79);
        Mp.put("five",629);
        Mp.remove("three",69);    //if the key and the value is right then the element is removed
        Mp.remove("two", 2);      //this wont run due to no availability of 2 on twokey
        System.out.println(Mp);
        System.out.println(Mp.keySet());
        System.out.println(Mp.values());
        System.out.println(Mp.entrySet()); //gives all the entries in the map

        Set<Entry<String,Integer>> entries = Mp.entrySet();  //here we get the set of the entries that are present in the hashmap
        entries.forEach(entry -> {
            ; //for loop to iterate in the entries set});
            entry.setValue(entry.getValue() * 100);

        });
            System.out.println(Mp);



    }
}

