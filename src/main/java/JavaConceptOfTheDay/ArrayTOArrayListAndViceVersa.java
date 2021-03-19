package JavaConceptOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayTOArrayListAndViceVersa {
    public static void main(String[] args) {

        int[] a = {1,2,3,4};

        String[] s = {"a", "b", "c"};

        ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));  // mthod1

        //al.addAll(Arrays.asList(a));

        Collections.addAll(al, s); //method 2

        System.out.println(al);

        al.addAll(Arrays.asList(s)); //method3

        //ArrayList to array
        al.toArray(s);
        for(String str : s)
        {
            System.out.println(str);
        }

    }
}
