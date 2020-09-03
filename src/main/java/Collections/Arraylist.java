package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

    public static void main(String[] args) {

        //this is also known as dynamic array
        //size not fixed n can add n numbers of values
        //can store duplicate values
        //maintain insertion order
        // can access random values because it store values on the basis of indexes
        // synchronized

        ArrayList ar = new ArrayList();

        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add('a');
        ar.add("hello");

        System.out.println(ar.size());
        System.out.println(ar.get(2));

        for(int i = 0 ; i <ar.size(); i++)
        {
            System.out.println(ar.get(i));
        }

        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(90);
        arr.add(70);
        arr.add(60);
        arr.add(50);
        //employee class object
        Employee e1 = new Employee("naveen", 27 , "QA");
        Employee e2 = new Employee("amal", 28, "dev");
        Employee e3 = new Employee("gaurav", 29, "support");

        ArrayList<Employee> ar4 = new ArrayList<Employee>();

        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);

        //using iterator to tranvers the values

        Iterator<Employee> it = ar4.iterator();
        while (it.hasNext())
        {
            Employee emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.Dept);
        }

        //********************************

        ArrayList<String> ar5 = new ArrayList<String>();
        ar5.add("amal");
        ar5.add("deep");
        ar5.add("chirag");

        ArrayList<String> ar6 = new ArrayList<String>();

        ar6.add("manni");
        ar6.add("ankur");

        ar5.addAll(ar6);

        for(int i = 0 ; i< ar5.size() ; i++)
        {
            System.out.println(ar5.get(i));
        }

//        ar5.removeAll(ar6);
//
//        for(int i = 0 ; i< ar5.size() ; i++)
//        {
//            System.out.println(ar5.get(i));
//        }
        System.out.println("************");
        ar5.retainAll(ar6);
        for(int i = 0 ; i< ar5.size() ; i++)
        {
            System.out.println(ar5.get(i));
        }

    }
}
