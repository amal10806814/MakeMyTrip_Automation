package JavaConceptOfTheDay;

import java.util.Arrays;

public class ShiftZeroToRight {

    public static void main(String[] args) {

        int[] a = {14,0,5,2,0,3,0};

        for (int i =0 ; i < a.length ; i++)
        {
            int temp = 0;
            for(int j = i+1 ; j< a.length ; j++)
            {
                if(a[i]<a[j])
                {
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
