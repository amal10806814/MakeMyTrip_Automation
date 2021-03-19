package SumitProblems;

import java.util.ArrayList;

public class sortArray {

    public static void main(String[] args) {

        int [] a = {2,1,3,4,6,7,4,9,2};

        int temp =0;

        for(int i = 0 ; i< a.length ; i++)
        {
            for(int j=i+1 ; j<a.length ; j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[j]= temp;
                }
            }
        }

       ArrayList<Integer> al = new ArrayList<Integer>();
       for (int i = 0 ; i < a.length; i++)
        {
            al.add(a[i]);
        }
        System.out.println(al);
        System.out.println(al.size());

        System.out.println(al.get(0));  //min value in an array
        System.out.println(al.get(8)); //max value in an array
        System.out.println(al.get(6)); //3rd highest value in an array
    }
}
