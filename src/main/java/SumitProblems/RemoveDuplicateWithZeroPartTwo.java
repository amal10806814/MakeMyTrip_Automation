package SumitProblems;

import java.util.Arrays;

public class RemoveDuplicateWithZeroPartTwo {
    public static void main(String[] args) {

        int [] a = {1,1,2,2,3,4,4,4,5,5};
        int j=0;
        int count=0;

        for (int i = 0 ; i<a.length-1 ; i++)   //a.lenght-1 = 9 so i will run only upto 8
        {
            if(a[i]!=a[i+1])
            {
                a[j]=a[i];
                j++;
            }
            else
            {
                count ++;
            }
        }
        a[j]=a[a.length-1];

        System.out.println(Arrays.toString(a));
        System.out.println(count);

        for(int i = 5 ; i< a.length ; i++)
        {
            a[i]=0;
        }
        System.out.println(Arrays.toString(a));
    }
}
