package Collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class hashTable {

    public static void main(String[] args) {

        //it is similar to hashmap but it is synchronized
        //store values in key-value
        //key --> object -- hashcode -- > value
        //can have only unique values
        //cannot contain null key or values

        Hashtable ht = new Hashtable();

        ht.put(1,"amal");
        ht.put(2,"gaurav");
        ht.put(3, "chirag");
        ht.put(1,"amal");
        //ht.put(null, "hello");

        Hashtable ht2 = new Hashtable();

        ht2 = (Hashtable) ht.clone();

        System.out.println(ht);
        System.out.println(ht2);

        //ht.clear();

        System.out.println(ht);
        System.out.println(ht2);

        if(ht2.containsValue("gaurav"))
        {
            System.out.println("true");
        }

        //print values using enumeration -- elements()

        Enumeration e = ht2.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

        System.out.println("*****************8");
        //get all values from hashtable using entryset -- set of hashtable values

        Set s = ht2.entrySet();
        System.out.println(s);

        System.out.println("***************");

        if(ht.equals(ht2))
        {
            System.out.println("true");
        }

        System.out.println(ht.get(1));

        System.out.println(ht.hashCode());

        //can also create generics hashtable

        Hashtable<String,String> ht3 = new Hashtable<String, String>();

        ht3.put("name","amal");
      //  ht3.put(1,"gb");

        System.out.println(ht3);
    }
}
