package JavaConceptOfTheDay;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] a ={8,4,6,3,9,5,1};

        for(int i= 0 ; i < a.length-1 ;i++) //1
        {
            int p = i; //1

            for(int j= i+1 ; j< a.length ; j++)
            {
                if(a[j]<a[p])  // 4<8
                {
                    p = j;  //1
                }
            }
            int temp = a[i]; //8
            a[i] = a [p]; //4
            a[p]= temp;  //8
        }

        System.out.println(Arrays.toString(a));
    }
}
