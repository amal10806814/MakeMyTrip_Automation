package JavaConceptOfTheDay;

import java.util.Arrays;

public class duplicateArrayTwo {
    public static void main(String[] args) {

        //using Arrays.sort method

        int[] a = {1, 2, 3, 2, 3, 1, 4, 5, 2, 1};

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        for(int i =0 ; i< a.length-1; i++)
        {
            if(a[i]==a[i+1])
            {
                System.out.println("duplicate element" + a[i]);
            }
        }
    }
}