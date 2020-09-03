package SumitProblems;

import java.util.ArrayList;

public class reverseArrayNew2 {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        for(int i = 0 ; i < a.length/2 ; i++)
        {
            int temp = a[i];
            a[i] = a[a.length-1 -i];
            a[a.length-1-i] = temp;
        }

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i =0 ; i < a.length ; i ++) {
            al.add(a[i]);
        }
        System.out.println(al);
    }
}
