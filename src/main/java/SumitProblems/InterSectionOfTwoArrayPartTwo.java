package SumitProblems;

import java.util.ArrayList;

public class InterSectionOfTwoArrayPartTwo {

    public static void main(String[] args) {

        int [] a = {21,34,41,22,35};
        int [] b = {61,34,45,21,11};

        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i = 0 ; i<a.length ; i++)
        {
            al.add(a[i]);
        }
        System.out.println(al);

        for(int j=0 ; j<a.length ; j++)
        {
            if(al.contains(b[j]))
            {
                System.out.println(b[j]);
            ;
            }
        }
    }
}
