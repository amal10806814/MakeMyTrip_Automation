package JavaPractice;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();

        l.add("a");
        l.add(null);
        l.add("abc");
        l.add(5);

        System.out.println(l);

        l.set(1,"b");
        l.add(0,"amal");

        System.out.println(l);
    }
}
