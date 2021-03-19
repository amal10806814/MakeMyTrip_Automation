package JavaConceptOfTheDay;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] a = {12, 9, 21, 17, 33, 7};
        int j = a.length-1 ;

        for(int i = 0 ; i < a.length/2 ; i++)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }

        System.out.println(Arrays.toString(a));
    }
}
