package JavaPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListnew {

  public static void main(String[] args) {

    LinkedList<String> ll = new LinkedList<String>();

    ll.add("amal");
    ll.add("gaurav");
    ll.add("chirag");

    System.out.println(ll.size());

    System.out.println(ll.get(2));

   // for(int i=0; ; i<ll.size()/2;)

    System.out.println(ll.get(0));

    System.out.println(ll);

    ll.addFirst("deepu");
    ll.addLast("manni");

    System.out.println(ll.get(4));

    ll.add(5,"happy");

    System.out.println(ll.get(5));


    ll.remove(5);

    System.out.println(ll.size());

    for(String str : ll)
    {
      System.out.println(str);
    }

    Iterator<String> it = ll.iterator();

    while(it.hasNext())
    {
      System.out.println(it.next());
    }

    int num = 0;

    while(ll.size()>num)
    {
      System.out.println(ll.get(num));
      num++ ;
    }

  }

}
