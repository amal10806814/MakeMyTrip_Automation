package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ArrayToArrayList {
    public static void main(String[] args) {

        int  abc [] = {10,20,30,40,50,10,20};
        //String s = abc.toString();
       // s.length();
        System.out.println(abc.length);

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0 ; i<abc.length ; i++)
        {
            list.add(abc[i]);
        }

        System.out.println(list);

        LinkedHashSet<Integer> hashlist = new LinkedHashSet<Integer>();

        hashlist.addAll(list);

        System.out.println(hashlist);

        list.clear();

        list.addAll(hashlist);

        System.out.println(list);








    }
}
