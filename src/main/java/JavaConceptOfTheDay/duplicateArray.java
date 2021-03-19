package JavaConceptOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicateArray {

    public static void main(String[] args) {

        //complexity o(n^2)
        //also known as brute force method
        int[] a = {1, 3, 2, 1, 1, 4,3, 2};

        for (int i = 0; i < a.length-1 ; i++) {
            for (int j = i+1 ; j < a.length; j++) {

                if (a[i] == a[j]) {

                    System.out.println("duplicate element" + + a[i] );

                }

            }
        }
    }
}