package JavaConceptOfTheDay;

import java.util.Arrays;

public class ShiftZeroUsingCounter {
    public static void main(String[] args) {
        int [] a = {2,0,3,5,0,6,0,8};

        // using Arrays.sort method
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));

        int counter = 0;

        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i]!=0)
            {
                a[counter] = a[i];
                counter++;
            }
        }

        while(counter<a.length)
        {
            a[counter] = 0;
            counter++;
        }

        System.out.println(Arrays.toString(a));


    }
}
