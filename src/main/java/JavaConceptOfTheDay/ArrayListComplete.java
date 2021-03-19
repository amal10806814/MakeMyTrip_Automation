package JavaConceptOfTheDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListComplete {
    public static void main(String[] args) {

        //different ways to create ArrayList
        ArrayList<String> al = new ArrayList<String>(); // default capacity 10

        ArrayList<String> al1 = new ArrayList<String>(20); // with increased initial capacity

        ArrayList<String> al2 = new ArrayList<String>(al); // Arraylist containing elements of supplied collections

        al.ensureCapacity(20); //now list can hold 20 elements

        System.out.println(al.size());

        al.add("amal");
        al.add("gb");
        al.add("deep");
        al.add("amal");

        al.trimToSize(); // it is used to decrease the capacity of Arryalist to its current size

        System.out.println(al.size());

        System.out.println(al.get(2)); // to print element at a given index

        System.out.println(al.isEmpty()); // to check whether arraylist is empty or not

        System.out.println(al.contains("amal")); // to check whether arraylist contains a particular element

        System.out.println(al.indexOf("deep")); // to check element index

        System.out.println(al.lastIndexOf("amal")); // it will print lat occurence of a particular element

        al.set(1, "chirag"); // to replace an element with a new one

        al.add("manni"); // to append an eleement at the end of an arrayList

        System.out.println(al);

        al.add(2,"lion"); // to insert an element at a particular position

        System.out.println(al);

        al.remove(2); // remove an element at a prticular position

        System.out.println(al);

        al.remove("manni"); // remove a given element from an arraylist if not present then arraylist will remain same

        //al.clear(); // to remove complete arraylist

        System.out.println(al);

        List<String> list =  al.subList(1,3);

        System.out.println(list); // it will fetch the sublist from index 1 upto 3-1 =2

        //sublist is backed by original Arraylist means if we make any changes in sublist those will reflect in Arraylist as well

        list.set(1,"hello"); // it will set hello at index 1 of this list not the original arraylist

        System.out.println(list);

        System.out.println(al); // hello also set in original array list

        //join two arraylist

        ArrayList<String> newAl = new ArrayList<String>();

        newAl.add("cat");
        newAl.add("dog");
        al.addAll(newAl); // adding new arraylist in al
        System.out.println(al);

        al.addAll(2,newAl);

        System.out.println(al);


//        Object [] ob = al.toArray(); // Arraylist to Array
//
//        for (Object obj : ob){
//
//            System.out.println(obj); // will print all element of object array
//
//        }

    }
}
