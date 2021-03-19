package JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapNew {

  public static void main(String[] args) {

    HashMap<Integer , String> hm = new HashMap<Integer, String>();

    hm.put(1,"amal");
    hm.put(2,"gaurav");
    hm.put(3,"deepu");

    //hm.remove(2);

    System.out.println(hm.get(1));

    System.out.println(hm);

    for (Map.Entry m : hm.entrySet())
    {
      System.out.println(m.getKey() +" "+ m.getValue());
    }

   // hm.remove(2);

    HashMap<Integer, EmployeeAList> emp = new HashMap<Integer, EmployeeAList>();

    EmployeeAList e1 = new EmployeeAList(24,"amal" , "testing");
    EmployeeAList e2 = new EmployeeAList(27, "gaurav" , "QA");

    emp.put(1,e1);
    emp.put(1,e2);

    //traverse the hashmap

    for (Entry<Integer , EmployeeAList> m : emp.entrySet())
    {

      EmployeeAList e = m.getValue();
      int k = m.getKey();

      System.out.println("print key " +" "+ k);

      //System.out.println(e1.name +" " + e1.department +" " + e1.age);

      System.out.println(e.name  +" "+ e.department +" "+ e.age);
    }



  }

}
