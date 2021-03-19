package JavaConceptOfTheDay;

import java.util.Arrays;

public class SecondLargestNoInArrray {

    public static void main(String[] args) {

        int [] a = {2,1,4,6,8,7,10};

        //this is another method
        // Arrays.sort(a);
        //System.out.println(a[a.length-2]);

        for(int i =0 ; i < a.length ; i++)
        {
            int temp = 0;
            for(int j = i+1 ; j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i]= a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("second largest array" + a[a.length-2]);
    }
}
