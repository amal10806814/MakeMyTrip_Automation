package Collections;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

    public static void main(String[] args) {

        //Hashmap implement Map interface
        // Hashmap extends AbstractMap class
        //It contains only unique elements
        // it may have one null key but can have multiple null values
        // it maintains no order
        //hashmap is non synchronized -- not thread safe
        // if hasmap being modified during multithreaind then you will get concurrent modification exception
        // also called fail fast condition


        HashMap<Integer,String> hm = new HashMap<Integer, String>();

        hm.put(1,"amal");
        hm.put(2,"gaurav");
        hm.put(1,"amal");

        System.out.println(hm.get(1));
        System.out.println(hm.get(4));

        for(Map.Entry m : hm.entrySet())
        {
            System.out.println(m.getKey() +" "+ m.getValue());
        }

       // hm.remove(2);
        System.out.println(hm);

        System.out.println("Iterator *********************");

        HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

        Employee e1 = new Employee("david" , 29, "dev");
        Employee e2 = new Employee("tom", 30 , "admin");
        Employee e3 = new Employee("mike", 32, "QA");

        emp.put(1,e1);
        emp.put(2,e2);
        emp.put(3,e3);

        for(Map.Entry<Integer,Employee> m1 : emp.entrySet())
        {
            Integer key = m1.getKey();
            System.out.println("Employee" + key +" details" );

            Employee e = m1.getValue();
            System.out.println(e.name +" "+ e.age + " "+ e.Dept );
        }


    }
}
