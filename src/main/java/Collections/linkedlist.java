package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("amal");
        ll.add("gaurav");
        ll.add("chirag");
        ll.add("deep");

        System.out.println(ll);

        ll.addFirst("manni");
        ll.addLast("sunny");

        System.out.println(ll);

        System.out.println(ll.get(0));

        ll.set(1, "deepak");

        System.out.println(ll.get(1));

        ll.removeFirst();
        ll.removeLast();

        ll.remove(3);

        System.out.println(ll);

        for(int i = 0; i <ll.size() ; i++)
        {
            System.out.println(ll.get(i));
        }

        System.out.println("*************");

        for (String s: ll) {
            System.out.println(s);

        }

        System.out.println("***********");

        Iterator<String> it = ll.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("++++++while loop+++++++++++");
        int num =0;
        while(ll.size()>num)
        {
            System.out.println(ll.get(num));
            num++;
        }
    }
}
