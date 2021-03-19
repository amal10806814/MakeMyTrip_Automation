package JavaConceptOfTheDay;

import java.util.Arrays;

public class equalityOfTwoArrays {

    public static void main(String[] args) {

        int [] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};

        for (int i = 0 ; i < a.length ; i++)
        {
            if(a[i]==b[i])
            {
                continue;
            }
            else
            {
                System.out.println("not identical array");
            }
        }
        System.out.println("identical array");

            // using Arrays.equals inbuilt method
        System.out.println(Arrays.equals(a, b));

    }
}
