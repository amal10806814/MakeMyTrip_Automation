package JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListnew {

  public static void main(String[] args) {

   ArrayList ar = new ArrayList();

   ar.add("amal");
   ar.add('a');
   ar.add(10);

    System.out.println(ar.size());

    System.out.println(ar.get(2));

    ArrayList<Integer> ar1 = new ArrayList<Integer>();

    ar1.add(10);
    ar1.add(121);
    ar1.add(21);

    ArrayList<String> ar2 = new ArrayList<String>();

    ar2.add("hello");
    ar2.add("new");
    ar2.add("bye");

    for (int i =0 ; i<ar2.size() ; i ++)

    {
      System.out.println(ar2.get(i));
    }

    ArrayList<EmployeeAList> emp = new ArrayList<EmployeeAList>();

    EmployeeAList e1 = new EmployeeAList(35,"amal","QA");
    EmployeeAList e2 = new EmployeeAList(33,"sachin","dev");

    emp.add(e1);
    emp.add(e2);

    //traverse the value using iterator

    Iterator<EmployeeAList> e = emp.iterator();

    while (e.hasNext())
    {
      EmployeeAList var = e.next();

      System.out.println(var.age);
      System.out.println(var.department);
      System.out.println(var.name);
    }
  }
}
