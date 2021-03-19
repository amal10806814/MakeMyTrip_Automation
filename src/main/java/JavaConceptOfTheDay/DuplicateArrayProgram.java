package JavaConceptOfTheDay;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class DuplicateArrayProgram {
    public static void main(String[] args) {

        //LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
////
////        for(int i = 0 ; i < a.length ; i++)
////        {
////            hs.add(a[i]);
////        }
////        System.out.println(hs);
//
        int [] a = {4,3,2,4,9,2};

        Arrays.sort(a); //{2,2,3,4,4,9}  // we need to make this array sorted

        int[] b = new int [a.length];
        int j =0;

        int count = 0;

        for(int i =0 ; i < a.length-1 ; i++)
        {

            if (a[i] != a[i + 1]) {
                b[j++] = a[i];
                count++;
            }
        }

        b[j++] = a[a.length - 1];

        count ++;

        System.out.println(Arrays.toString(b));

        for(int i = 0 ; i < count ; i++)
        {
            System.out.println(b[i]);
        }
        }
    }
